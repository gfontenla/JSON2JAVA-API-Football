
package API;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("self")
    @Expose
    public Self self;
    @SerializedName("competition")
    @Expose
    public Competition competition;

}
