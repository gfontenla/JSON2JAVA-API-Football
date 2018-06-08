
package API;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links_ {

    @SerializedName("self")
    @Expose
    public Self_ self;
    @SerializedName("fixtures")
    @Expose
    public Fixtures fixtures;
    @SerializedName("players")
    @Expose
    public Players players;

}
