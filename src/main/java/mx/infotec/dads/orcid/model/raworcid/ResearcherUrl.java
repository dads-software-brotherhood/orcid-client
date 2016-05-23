
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ResearcherUrl {

  @SerializedName("url-name")
  @Expose
  private UrlName urlName;
  @SerializedName("url")
  @Expose
  private Url     url;

  /**
   * 
   * @return The urlName
   */
  public UrlName getUrlName() {
    return urlName;
  }

  /**
   * 
   * @param urlName The url-name
   */
  public void setUrlName(UrlName urlName) {
    this.urlName = urlName;
  }

  /**
   * 
   * @return The url
   */
  public Url getUrl() {
    return url;
  }

  /**
   * 
   * @param url The url
   */
  public void setUrl(Url url) {
    this.url = url;
  }

}
