
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Keyword {

  @SerializedName("value")
  @Expose
  private String value;

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

}
