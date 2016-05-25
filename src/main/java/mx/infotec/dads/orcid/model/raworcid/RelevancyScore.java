
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RelevancyScore {

  @SerializedName("value")
  @Expose
  private Double value;

  /**
   * 
   * @return The value
   */
  public Double getValue() {
    return value;
  }

  /**
   * 
   * @param value The value
   */
  public void setValue(Double value) {
    this.value = value;
  }

}
