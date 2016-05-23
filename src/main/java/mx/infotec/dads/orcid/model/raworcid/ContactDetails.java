
package mx.infotec.dads.orcid.model.raworcid;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ContactDetails {

    @SerializedName("email")
    @Expose
    private List<Object> email = new ArrayList<Object>();
    @SerializedName("address")
    @Expose
    private Address address;

    /**
     * 
     * @return
     *     The email
     */
    public List<Object> getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(List<Object> email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

}
