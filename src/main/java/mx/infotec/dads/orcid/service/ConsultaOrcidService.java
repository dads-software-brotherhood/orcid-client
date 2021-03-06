package mx.infotec.dads.orcid.service;

import java.util.List;

import mx.infotec.dads.orcid.exceptions.OrcidServiceException;
import mx.infotec.dads.orcid.model.PersonaGenerica;

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
  PersonaGenerica consultaPorId(String idOrcid) throws OrcidServiceException;

  /**
   * Método para la consulta de persona por su idOrcid. El resultado es un conjunto de valores
   * 
   * @param idOrcid
   * @return
   * @throws OrcidServiceException
   */
  List<PersonaGenerica> consultaListaPorId(String idOrcid) throws OrcidServiceException;
}
