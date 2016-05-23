
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PersonalDetails {

    @SerializedName("given-names")
    @Expose
    private GivenNames givenNames;
    @SerializedName("family-name")
    @Expose
    private FamilyName familyName;
    @SerializedName("credit-name")
    @Expose
    private Object creditName;
    @SerializedName("other-names")
    @Expose
    private OtherNames otherNames;

    /**
     * 
     * @return
     *     The givenNames
     */
    public GivenNames getGivenNames() {
        return givenNames;
    }

    /**
     * 
     * @param givenNames
     *     The given-names
     */
    public void setGivenNames(GivenNames givenNames) {
        this.givenNames = givenNames;
    }

    /**
     * 
     * @return
     *     The familyName
     */
    public FamilyName getFamilyName() {
        return familyName;
    }

    /**
     * 
     * @param familyName
     *     The family-name
     */
    public void setFamilyName(FamilyName familyName) {
        this.familyName = familyName;
    }

    /**
     * 
     * @return
     *     The creditName
     */
    public Object getCreditName() {
        return creditName;
    }

    /**
     * 
     * @param creditName
     *     The credit-name
     */
    public void setCreditName(Object creditName) {
        this.creditName = creditName;
    }

    /**
     * 
     * @return
     *     The otherNames
     */
    public OtherNames getOtherNames() {
        return otherNames;
    }

    /**
     * 
     * @param otherNames
     *     The other-names
     */
    public void setOtherNames(OtherNames otherNames) {
        this.otherNames = otherNames;
    }

}
