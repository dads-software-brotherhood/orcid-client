package mx.infotec.dads.orcid.service.impl;

import mx.infotec.dads.orcid.model.Credential;
import mx.infotec.dads.orcid.service.CredentialManagerService;
import mx.infotec.dads.orcid.support.CredentialSource;

/**
 * Servicio encagardo de administraciar el origen de donde se cargan las credenciales del usuario
 * que consultará al servicio del ORCID
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class CredencialsManagerServiceImpl implements CredentialManagerService {

  @Override
  public Credential loadCredentials(CredentialSource source) {
    switch (source) {
      case CREDENTIAL_CLASS:
        // Las siguientes credenciales deberán de colocarse en un archivo de propiedades
        Credential credential = new Credential();
        credential.setClientId("APP-Z98YAVMM3Y0M3520");
        credential.setClientSecret("ebd6db36-fa36-4efe-8a32-abfd5ea2a654");
        credential.setToken("4f338496-c5a5-4f6e-a350-2dce8fee93a6");
        return credential;
      default:
        break;
    }
    return null;
  }



}
