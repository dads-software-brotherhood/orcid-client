package mx.infotec.dads.orcid.service;

import mx.infotec.dads.orcid.model.Credential;
import mx.infotec.dads.orcid.support.CredentialSource;

public interface CredentialManagerService {

  /**
   * Método encargado de cargar las credenciales que se utilizarán para llevar a cabo las consultas
   * al sistema ORCID.
   * 
   * @param source
   * @return La credencial depediendo el tipo de fuente
   */
  Credential loadCredentials(CredentialSource source);
}
