package mx.infotec.dads.orcid.model;

import java.util.Date;

/**
 * Clase Persona que representa a la entidad Persona. Esta entidad es empleada para capturar la
 * información que se consulta del servicio del ORCID
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class Persona {

  private Date    fechaNacCons;
  private String  idOrcid;
  private Integer idPersona;
  private String  idPersonaConacyt;
  private Integer idTipoIdentificador;
  private String  identificador;
  private String  nombres;
  private String  primerApellido;
  private String  tipoPersona;

  public Date getFechaNacCons() {
    return fechaNacCons;
  }

  public void setFechaNacCons(Date fechaNacCons) {
    this.fechaNacCons = fechaNacCons;
  }

  public String getIdOrcid() {
    return idOrcid;
  }

  public void setIdOrcid(String idOrcid) {
    this.idOrcid = idOrcid;
  }

  public Integer getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(Integer idPersona) {
    this.idPersona = idPersona;
  }

  public String getIdPersonaConacyt() {
    return idPersonaConacyt;
  }

  public void setIdPersonaConacyt(String idPersonaConacyt) {
    this.idPersonaConacyt = idPersonaConacyt;
  }

  public Integer getIdTipoIdentificador() {
    return idTipoIdentificador;
  }

  public void setIdTipoIdentificador(Integer idTipoIdentificador) {
    this.idTipoIdentificador = idTipoIdentificador;
  }

  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public String getTipoPersona() {
    return tipoPersona;
  }

  public void setTipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
  }
}
