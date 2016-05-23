package mx.infotec.dads.orcid.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mx.infotec.dads.orcid.exceptions.OrcidServiceException;
import mx.infotec.dads.orcid.model.Persona;
import mx.infotec.dads.orcid.service.impl.ConsultaOrcidServiceImpl;
import mx.infotec.dads.orcid.service.impl.CredencialsManagerServiceImpl;

/**
 * Ejemplo para la consulta del Orcid. El objetivo de esta clase no es se una
 * prueba unitaria, más bien pretende sólo demostrar el uso del api del ORCID
 * 
 * @author Daniel Cortes Pichado
 *
 */
public class ConsultaOrcidServiceTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaOrcidServiceTest.class);

	private ConsultaOrcidService consultaOrcidService;

	@BeforeTest
	public void beforeTest() {
		CredentialManagerService credentialManagerService = new CredencialsManagerServiceImpl();
		consultaOrcidService = new ConsultaOrcidServiceImpl(credentialManagerService);
	}

	@Test
	public void consultaPorId() throws OrcidServiceException {
		Persona persona = consultaOrcidService.consultaPorId("0000-0001-5594");
		if (persona != null) {
			LOGGER.info("Fecha: " + persona.getFechaNacCons());
			LOGGER.info("idOrcid: " + persona.getIdOrcid());
			LOGGER.info("idPersona: " + persona.getIdPersona());
			LOGGER.info("idPersonaConacyt: " + persona.getIdPersonaConacyt());
			LOGGER.info("idTipoIdentificador: " + persona.getIdTipoIdentificador());
			LOGGER.info("identificador: " + persona.getIdentificador());
			LOGGER.info("nombres: " + persona.getNombres());
			LOGGER.info("primerApellido: " + persona.getPrimerApellido());
			LOGGER.info("tipoPersona: " + persona.getTipoPersona());
		}
	}

	@Test
	public void consultaPorIdList() throws OrcidServiceException {
		List<Persona> personas = consultaOrcidService.consultaPorIdList("0000-0001-5594");
		for (Persona persona : personas) {
			if (persona != null) {
				LOGGER.info("Fecha: " + persona.getFechaNacCons());
				LOGGER.info("idOrcid: " + persona.getIdOrcid());
				LOGGER.info("idPersona: " + persona.getIdPersona());
				LOGGER.info("idPersonaConacyt: " + persona.getIdPersonaConacyt());
				LOGGER.info("idTipoIdentificador: " + persona.getIdTipoIdentificador());
				LOGGER.info("identificador: " + persona.getIdentificador());
				LOGGER.info("nombres: " + persona.getNombres());
				LOGGER.info("primerApellido: " + persona.getPrimerApellido());
				LOGGER.info("tipoPersona: " + persona.getTipoPersona());
			}
		}
	}
}
