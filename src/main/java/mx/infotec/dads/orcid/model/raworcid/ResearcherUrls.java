
package mx.infotec.dads.orcid.model.raworcid;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ResearcherUrls {

  @SerializedName("researcher-url")
  @Expose
  private List<ResearcherUrl> researcherUrl = new ArrayList<ResearcherUrl>();
  @SerializedName("visibility")
  @Expose
  private String              visibility;

  /**
   * 
   * @return The researcherUrl
   */
  public List<ResearcherUrl> getResearcherUrl() {
    return researcherUrl;
  }

  /**
   * 
   * @param researcherUrl The researcher-url
   */
  public void setResearcherUrl(List<ResearcherUrl> researcherUrl) {
    this.researcherUrl = researcherUrl;
  }

  /**
   * 
   * @return The visibility
   */
  public String getVisibility() {
    return visibility;
  }

  /**
   * 
   * @param visibility The visibility
   */
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

}
