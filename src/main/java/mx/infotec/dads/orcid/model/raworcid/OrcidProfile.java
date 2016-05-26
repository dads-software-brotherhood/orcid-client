
package mx.infotec.dads.orcid.model.raworcid;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class OrcidProfile {

    @SerializedName("orcid")
    @Expose
    private Object orcid;
    @SerializedName("orcid-id")
    @Expose
    private Object orcidId;
    @SerializedName("orcid-identifier")
    @Expose
    private OrcidIdentifier orcidIdentifier;
    @SerializedName("orcid-deprecated")
    @Expose
    private Object orcidDeprecated;
    @SerializedName("orcid-preferences")
    @Expose
    private Object orcidPreferences;
    @SerializedName("orcid-history")
    @Expose
    private Object orcidHistory;
    @SerializedName("orcid-bio")
    @Expose
    private OrcidBio orcidBio;
    @SerializedName("orcid-activities")
    @Expose
    private Object orcidActivities;
    @SerializedName("orcid-internal")
    @Expose
    private Object orcidInternal;
    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("group-type")
    @Expose
    private Object groupType;
    @SerializedName("client-type")
    @Expose
    private Object clientType;

    /**
     * 
     * @return
     *     The orcid
     */
    public Object getOrcid() {
        return orcid;
    }

    /**
     * 
     * @param orcid
     *     The orcid
     */
    public void setOrcid(Object orcid) {
        this.orcid = orcid;
    }

    /**
     * 
     * @return
     *     The orcidId
     */
    public Object getOrcidId() {
        return orcidId;
    }

    /**
     * 
     * @param orcidId
     *     The orcid-id
     */
    public void setOrcidId(Object orcidId) {
        this.orcidId = orcidId;
    }

    /**
     * 
     * @return
     *     The orcidIdentifier
     */
    public OrcidIdentifier getOrcidIdentifier() {
        return orcidIdentifier;
    }

    /**
     * 
     * @param orcidIdentifier
     *     The orcid-identifier
     */
    public void setOrcidIdentifier(OrcidIdentifier orcidIdentifier) {
        this.orcidIdentifier = orcidIdentifier;
    }

    /**
     * 
     * @return
     *     The orcidDeprecated
     */
    public Object getOrcidDeprecated() {
        return orcidDeprecated;
    }

    /**
     * 
     * @param orcidDeprecated
     *     The orcid-deprecated
     */
    public void setOrcidDeprecated(Object orcidDeprecated) {
        this.orcidDeprecated = orcidDeprecated;
    }

    /**
     * 
     * @return
     *     The orcidPreferences
     */
    public Object getOrcidPreferences() {
        return orcidPreferences;
    }

    /**
     * 
     * @param orcidPreferences
     *     The orcid-preferences
     */
    public void setOrcidPreferences(Object orcidPreferences) {
        this.orcidPreferences = orcidPreferences;
    }

    /**
     * 
     * @return
     *     The orcidHistory
     */
    public Object getOrcidHistory() {
        return orcidHistory;
    }

    /**
     * 
     * @param orcidHistory
     *     The orcid-history
     */
    public void setOrcidHistory(Object orcidHistory) {
        this.orcidHistory = orcidHistory;
    }

    /**
     * 
     * @return
     *     The orcidBio
     */
    public OrcidBio getOrcidBio() {
        return orcidBio;
    }

    /**
     * 
     * @param orcidBio
     *     The orcid-bio
     */
    public void setOrcidBio(OrcidBio orcidBio) {
        this.orcidBio = orcidBio;
    }

    /**
     * 
     * @return
     *     The orcidActivities
     */
    public Object getOrcidActivities() {
        return orcidActivities;
    }

    /**
     * 
     * @param orcidActivities
     *     The orcid-activities
     */
    public void setOrcidActivities(Object orcidActivities) {
        this.orcidActivities = orcidActivities;
    }

    /**
     * 
     * @return
     *     The orcidInternal
     */
    public Object getOrcidInternal() {
        return orcidInternal;
    }

    /**
     * 
     * @param orcidInternal
     *     The orcid-internal
     */
    public void setOrcidInternal(Object orcidInternal) {
        this.orcidInternal = orcidInternal;
    }

    /**
     * 
     * @return
     *     The type
     */
    public Object getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Object type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The groupType
     */
    public Object getGroupType() {
        return groupType;
    }

    /**
     * 
     * @param groupType
     *     The group-type
     */
    public void setGroupType(Object groupType) {
        this.groupType = groupType;
    }

    /**
     * 
     * @return
     *     The clientType
     */
    public Object getClientType() {
        return clientType;
    }

    /**
     * 
     * @param clientType
     *     The client-type
     */
    public void setClientType(Object clientType) {
        this.clientType = clientType;
    }

}
