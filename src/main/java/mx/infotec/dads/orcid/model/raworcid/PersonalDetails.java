
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
    private CreditName creditName;
    @SerializedName("other-names")
    @Expose
    private Object otherNames;

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
    public CreditName getCreditName() {
        return creditName;
    }

    /**
     * 
     * @param creditName
     *     The credit-name
     */
    public void setCreditName(CreditName creditName) {
        this.creditName = creditName;
    }

    /**
     * 
     * @return
     *     The otherNames
     */
    public Object getOtherNames() {
        return otherNames;
    }

    /**
     * 
     * @param otherNames
     *     The other-names
     */
    public void setOtherNames(Object otherNames) {
        this.otherNames = otherNames;
    }

}
