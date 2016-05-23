package mx.infotec.dads.orcid.service;

import mx.infotec.dads.orcid.exceptions.OrcidServiceException;
import mx.infotec.dads.orcid.model.Persona;

/**
 * Interface para la consulta del ORCID
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public interface ConsultaOrcidService {
	/**
	 * Método para la consulta de persona por su idOrcid
	 * 
	 * @param idOrcid
	 * @return Persona con el identificador de idOrcid
	 * @throws OrcidServiceException
	 */
	Persona consultaPorId(String idOrcid) throws OrcidServiceException;
}
