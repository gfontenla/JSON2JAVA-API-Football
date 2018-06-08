
package API;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Api {

    @SerializedName("_links")
    @Expose
    public Links links;
    @SerializedName("count")
    @Expose
    public int count;
    @SerializedName("teams")
    @Expose
    public List<Team> teams = null;

    public int tamanoTeams(){
        
        return teams.size();
    }
    
}
