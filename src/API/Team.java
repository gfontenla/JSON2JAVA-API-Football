
package API;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("_links")
    @Expose
    public Links_ links;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("shortName")
    @Expose
    public Object shortName;
    @SerializedName("squadMarketValue")
    @Expose
    public Object squadMarketValue;
    @SerializedName("crestUrl")
    @Expose
    public String crestUrl;
    
    public String toString() {
        return ("Pais: "+this.name+"\n");
    }

}
