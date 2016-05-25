
package mx.infotec.dads.orcid.model.raworcid;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class OtherNames {

  @SerializedName("other-name")
  @Expose
  private List<OtherName> otherName = new ArrayList<OtherName>();
  @SerializedName("visibility")
  @Expose
  private String          visibility;

  /**
   * 
   * @return The otherName
   */
  public List<OtherName> getOtherName() {
    return otherName;
  }

  /**
   * 
   * @param otherName The other-name
   */
  public void setOtherName(List<OtherName> otherName) {
    this.otherName = otherName;
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
