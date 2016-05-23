package mx.infotec.dads.orcid.model;

/**
 * Clase Authentication, representa las credenciales necesarias para conectarse al servicio del
 * ORCID. Para utilizar el servicio del ORCID, es necesario registrarse y conseguir estas
 * credenciales.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class Credential {
  private String clientId;
  private String clientSecret;
  private String token;

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}
