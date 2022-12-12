package mobi.appcent.helium.model.statechannel;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class Summary {
    private String owner;
    @SerializedName("num_packets")
    private Integer numPackets;
    @SerializedName("num_dcs")
    private Integer numDcs;
    private String location;
    private String client;
}
