
package mx.infotec.dads.orcid.model.raworcid;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class OrcidSearchResults {

    @SerializedName("orcid-search-result")
    @Expose
    private List<OrcidSearchResult> orcidSearchResult = new ArrayList<OrcidSearchResult>();
    @SerializedName("num-found")
    @Expose
    private Integer numFound;

    /**
     * 
     * @return
     *     The orcidSearchResult
     */
    public List<OrcidSearchResult> getOrcidSearchResult() {
        return orcidSearchResult;
    }

    /**
     * 
     * @param orcidSearchResult
     *     The orcid-search-result
     */
    public void setOrcidSearchResult(List<OrcidSearchResult> orcidSearchResult) {
        this.orcidSearchResult = orcidSearchResult;
    }

    /**
     * 
     * @return
     *     The numFound
     */
    public Integer getNumFound() {
        return numFound;
    }

    /**
     * 
     * @param numFound
     *     The num-found
     */
    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

}
