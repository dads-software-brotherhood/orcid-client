package mx.infotec.dads.orcid.support;

/**
 * Enumeración CredentialSource utilizada para elegir la fuente de donde se conseguiran las
 * credenciales del usuario. Esta enumeración es utilizada por el servicio
 * {@link mx.infotec.dads.orcid.service.CredentialManagerService}}
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public enum CredentialSource {

  PROPERTIES_FILE, CREDENTIAL_CLASS, DATA_BASE, REMOTE_SERVICE
}
