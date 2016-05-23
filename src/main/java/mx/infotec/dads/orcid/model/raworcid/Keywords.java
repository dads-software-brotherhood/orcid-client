
package mx.infotec.dads.orcid.model.raworcid;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Keywords {

    @SerializedName("keyword")
    @Expose
    private List<Keyword> keyword = new ArrayList<Keyword>();
    @SerializedName("visibility")
    @Expose
    private String visibility;

    /**
     * 
     * @return
     *     The keyword
     */
    public List<Keyword> getKeyword() {
        return keyword;
    }

    /**
     * 
     * @param keyword
     *     The keyword
     */
    public void setKeyword(List<Keyword> keyword) {
        this.keyword = keyword;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

}
