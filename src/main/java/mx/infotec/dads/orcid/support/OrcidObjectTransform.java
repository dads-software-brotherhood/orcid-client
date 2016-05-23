package mx.infotec.dads.orcid.support;

import mx.infotec.dads.orcid.model.raworcid.OrcidProfile;

/**
 * Interface para la definición de las operaciones de tranformación del ObjetoOrcid y el objeto de
 * negocio deseado.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public interface OrcidObjectTransform<T> {

  T tranform(OrcidProfile orcidProfile);
}
