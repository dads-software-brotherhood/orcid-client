package mx.infotec.dads.orcid.exceptions;

/**
 * Exception que se lanza cuando una consulta al servicio del ORCID falla.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class OrcidRuntimeException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public OrcidRuntimeException() {
    super();
  }

  public OrcidRuntimeException(String s) {
    super(s);
  }

  public OrcidRuntimeException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public OrcidRuntimeException(Throwable throwable) {
    super(throwable);
  }

}
