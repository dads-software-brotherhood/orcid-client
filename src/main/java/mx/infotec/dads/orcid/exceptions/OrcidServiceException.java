package mx.infotec.dads.orcid.exceptions;

/**
 * Exception que se lanza cuando una consulta al servicio del ORCID falla.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class OrcidServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public OrcidServiceException() {
		super();
	}

	public OrcidServiceException(String s) {
		super(s);
	}

	public OrcidServiceException(String s, Throwable throwable) {
		super(s, throwable);
	}

	public OrcidServiceException(Throwable throwable) {
		super(throwable);
	}

}
