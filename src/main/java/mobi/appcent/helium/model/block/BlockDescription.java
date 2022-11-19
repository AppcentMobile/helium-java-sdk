package mobi.appcent.helium.model.block;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class BlockDescription {
    @SerializedName("transaction_count")
    public Integer transaction_count;
    public String time;
    @SerializedName("snapshot_hash")
    public String snapshot_hash;
    @SerializedName("prev_hash")
    public String prev_hash;
    public Integer height;
    public String hash;
}
