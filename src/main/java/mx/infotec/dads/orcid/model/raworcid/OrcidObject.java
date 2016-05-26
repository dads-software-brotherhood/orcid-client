
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class OrcidObject {

    @SerializedName("message-version")
    @Expose
    private String messageVersion;
    @SerializedName("orcid-profile")
    @Expose
    private Object orcidProfile;
    @SerializedName("orcid-search-results")
    @Expose
    private OrcidSearchResults orcidSearchResults;
    @SerializedName("error-desc")
    @Expose
    private Object errorDesc;

    /**
     * 
     * @return
     *     The messageVersion
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * 
     * @param messageVersion
     *     The message-version
     */
    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * 
     * @return
     *     The orcidProfile
     */
    public Object getOrcidProfile() {
        return orcidProfile;
    }

    /**
     * 
     * @param orcidProfile
     *     The orcid-profile
     */
    public void setOrcidProfile(Object orcidProfile) {
        this.orcidProfile = orcidProfile;
    }

    /**
     * 
     * @return
     *     The orcidSearchResults
     */
    public OrcidSearchResults getOrcidSearchResults() {
        return orcidSearchResults;
    }

    /**
     * 
     * @param orcidSearchResults
     *     The orcid-search-results
     */
    public void setOrcidSearchResults(OrcidSearchResults orcidSearchResults) {
        this.orcidSearchResults = orcidSearchResults;
    }

    /**
     * 
     * @return
     *     The errorDesc
     */
    public Object getErrorDesc() {
        return errorDesc;
    }

    /**
     * 
     * @param errorDesc
     *     The error-desc
     */
    public void setErrorDesc(Object errorDesc) {
        this.errorDesc = errorDesc;
    }

}
