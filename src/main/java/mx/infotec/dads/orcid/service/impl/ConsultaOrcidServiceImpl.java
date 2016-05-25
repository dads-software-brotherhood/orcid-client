package mx.infotec.dads.orcid.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import mx.infotec.dads.orcid.exceptions.OrcidServiceException;
import mx.infotec.dads.orcid.model.Credential;
import mx.infotec.dads.orcid.model.Persona;
import mx.infotec.dads.orcid.model.raworcid.OrcidObject;
import mx.infotec.dads.orcid.model.raworcid.OrcidSearchResult;
import mx.infotec.dads.orcid.model.raworcid.OrcidSearchResults;
import mx.infotec.dads.orcid.service.ConsultaOrcidService;
import mx.infotec.dads.orcid.service.CredentialManagerService;
import mx.infotec.dads.orcid.support.Constantes;
import mx.infotec.dads.orcid.support.CredentialSource;
import mx.infotec.dads.orcid.support.OrcidPersonaTransform;

/**
 * Servicio que implementa la consulta del ORCID. Esta clase es sólo para fines demostrativos, se
 * deberá de adaptar a las necesidades reales de cada aplicación.
 * 
 * @author Daniel Cortes Pichard
 *
 */
public class ConsultaOrcidServiceImpl implements ConsultaOrcidService {

  private CredentialManagerService credentialManagerService;

  public ConsultaOrcidServiceImpl(CredentialManagerService credentialManagerService) {
    this.credentialManagerService = credentialManagerService;
  }

  @Override
  public Persona consultaPorId(String idOrcid) throws OrcidServiceException {
    Credential credential =
        credentialManagerService.loadCredentials(CredentialSource.CREDENTIAL_CLASS);
    WebResource webResource = createWebResource(credential, idOrcid);
    ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

    if (response.getStatus() != 200) {
      throw new OrcidServiceException(
          "Consulta al servicio del Orcid, HTTP error code : " + response.getStatus());
    }
    OrcidObject orcidObject =
        new Gson().fromJson(response.getEntity(String.class), OrcidObject.class);
    if (orcidObject != null) {
      return extractValues(orcidObject);
    } else {
      return null;
    }
  }

  @Override
  public List<Persona> consultaListaPorId(String idOrcid) throws OrcidServiceException {
    Credential credential =
        credentialManagerService.loadCredentials(CredentialSource.CREDENTIAL_CLASS);
    WebResource webResource = createWebResource(credential, idOrcid);
    ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

    if (response.getStatus() != 200) {
      throw new OrcidServiceException(
          "Consulta al servicio del Orcid, HTTP error code : " + response.getStatus());
    }
    OrcidObject orcidObject =
        new Gson().fromJson(response.getEntity(String.class), OrcidObject.class);
    if (orcidObject != null) {
      return extractListValues(orcidObject);
    } else {
      return new ArrayList<>();
    }
  }

  private static WebResource createWebResource(Credential credential, String idOrcid) {

    Client client = Client.create();
    client.resource("").header("Authorization:Bearer", credential.getToken()).header("Content-Type",
        "application/orcid+json");
    WebResource webResource = client.resource(Constantes.URL_ORCID + "?q=" + idOrcid);
    return webResource;
  }

  private static Persona extractValues(OrcidObject orcidObject) {
    OrcidSearchResults orcidSearchResults = orcidObject.getOrcidSearchResults();
    if (orcidSearchResults.getNumFound() > 0) {
      List<OrcidSearchResult> orcidSearchResult = orcidSearchResults.getOrcidSearchResult();
      OrcidSearchResult osr = orcidSearchResult.get(0);
      return OrcidPersonaTransform.tranform(osr.getOrcidProfile());
    } else {
      return null;
    }
  }

  private static List<Persona> extractListValues(OrcidObject orcidObject) {
    OrcidSearchResults orcidSearchResults = orcidObject.getOrcidSearchResults();
    List<Persona> personas = new ArrayList<Persona>();
    if (orcidSearchResults.getNumFound() > 0) {
      List<OrcidSearchResult> orcidSearchResult = orcidSearchResults.getOrcidSearchResult();
      for (OrcidSearchResult result : orcidSearchResult) {
        personas.add(OrcidPersonaTransform.tranform(result.getOrcidProfile()));
      }
      return personas;
    } else {
      return personas;
    }
  }
}
