
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class OrcidBio {

  @SerializedName("personal-details")
  @Expose
  private PersonalDetails personalDetails;
  @SerializedName("biography")
  @Expose
  private Object          biography;
  @SerializedName("researcher-urls")
  @Expose
  private ResearcherUrls  researcherUrls;
  @SerializedName("contact-details")
  @Expose
  private ContactDetails  contactDetails;
  @SerializedName("keywords")
  @Expose
  private Keywords        keywords;
  @SerializedName("external-identifiers")
  @Expose
  private Object          externalIdentifiers;
  @SerializedName("delegation")
  @Expose
  private Object          delegation;
  @SerializedName("scope")
  @Expose
  private Object          scope;

  /**
   * 
   * @return The personalDetails
   */
  public PersonalDetails getPersonalDetails() {
    return personalDetails;
  }

  /**
   * 
   * @param personalDetails The personal-details
   */
  public void setPersonalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
  }

  /**
   * 
   * @return The biography
   */
  public Object getBiography() {
    return biography;
  }

  /**
   * 
   * @param biography The biography
   */
  public void setBiography(Object biography) {
    this.biography = biography;
  }

  /**
   * 
   * @return The researcherUrls
   */
  public ResearcherUrls getResearcherUrls() {
    return researcherUrls;
  }

  /**
   * 
   * @param researcherUrls The researcher-urls
   */
  public void setResearcherUrls(ResearcherUrls researcherUrls) {
    this.researcherUrls = researcherUrls;
  }

  /**
   * 
   * @return The contactDetails
   */
  public ContactDetails getContactDetails() {
    return contactDetails;
  }

  /**
   * 
   * @param contactDetails The contact-details
   */
  public void setContactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }

  /**
   * 
   * @return The keywords
   */
  public Keywords getKeywords() {
    return keywords;
  }

  /**
   * 
   * @param keywords The keywords
   */
  public void setKeywords(Keywords keywords) {
    this.keywords = keywords;
  }

  /**
   * 
   * @return The externalIdentifiers
   */
  public Object getExternalIdentifiers() {
    return externalIdentifiers;
  }

  /**
   * 
   * @param externalIdentifiers The external-identifiers
   */
  public void setExternalIdentifiers(Object externalIdentifiers) {
    this.externalIdentifiers = externalIdentifiers;
  }

  /**
   * 
   * @return The delegation
   */
  public Object getDelegation() {
    return delegation;
  }

  /**
   * 
   * @param delegation The delegation
   */
  public void setDelegation(Object delegation) {
    this.delegation = delegation;
  }

  /**
   * 
   * @return The scope
   */
  public Object getScope() {
    return scope;
  }

  /**
   * 
   * @param scope The scope
   */
  public void setScope(Object scope) {
    this.scope = scope;
  }

}
