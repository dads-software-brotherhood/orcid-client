
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class FamilyName {

  @SerializedName("value")
  @Expose
  private String value;
  @SerializedName("visibility")
  @Expose
  private String visibility;

  /**
   * 
   * @return The value
   */
  public String getValue() {
    return value;
  }

  /**
   * 
   * @param value The value
   */
  public void setValue(String value) {
    this.value = value;
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
