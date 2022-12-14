package mobi.appcent.helium.model.challenge;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class Witness {
    private String timestamp;
    private Integer signal;
    @SerializedName("packet_hash")
    private String packetHash;
    private String owner;
    private String location;
    private String gateway;
}
