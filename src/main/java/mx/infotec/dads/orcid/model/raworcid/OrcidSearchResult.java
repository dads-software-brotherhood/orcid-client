
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class OrcidSearchResult {

    @SerializedName("relevancy-score")
    @Expose
    private RelevancyScore relevancyScore;
    @SerializedName("orcid-profile")
    @Expose
    private OrcidProfile orcidProfile;

    /**
     * 
     * @return
     *     The relevancyScore
     */
    public RelevancyScore getRelevancyScore() {
        return relevancyScore;
    }

    /**
     * 
     * @param relevancyScore
     *     The relevancy-score
     */
    public void setRelevancyScore(RelevancyScore relevancyScore) {
        this.relevancyScore = relevancyScore;
    }

    /**
     * 
     * @return
     *     The orcidProfile
     */
    public OrcidProfile getOrcidProfile() {
        return orcidProfile;
    }

    /**
     * 
     * @param orcidProfile
     *     The orcid-profile
     */
    public void setOrcidProfile(OrcidProfile orcidProfile) {
        this.orcidProfile = orcidProfile;
    }

}
