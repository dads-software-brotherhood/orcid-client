package mx.infotec.dads.orcid.support;

import java.util.Date;

import mx.infotec.dads.orcid.model.Persona;
import mx.infotec.dads.orcid.model.raworcid.OrcidBio;
import mx.infotec.dads.orcid.model.raworcid.OrcidProfile;

public class OrcidPersonaTransform {


  /**
   * Método que tranforma un objeto OrcidBio en uno de tipo Persona. Las propiedades que faltan por
   * llenar son:<b>idPersona<b> misma que dependerá del id que se le asigne en el momento de guardar
   * en los catálogos del CONACYT.
   */

  public static Persona tranform(OrcidProfile orcidProfile) {
    OrcidBio orcidBio = orcidProfile.getOrcidBio();
    Persona persona = new Persona();
    persona.setFechaNacCons(new Date());
    persona.setIdOrcid(orcidProfile.getOrcidIdentifier().getPath());
    persona.setIdPersonaConacyt(persona.getIdOrcid());
    persona.setIdentificador(persona.getIdOrcid());
    persona.setIdTipoIdentificador(0);
    persona.setNombres(orcidBio.getPersonalDetails().getGivenNames().getValue());
    persona.setPrimerApellido(orcidBio.getPersonalDetails().getFamilyName().getValue());
    persona.setTipoPersona("F");
    return persona;
  }
}
