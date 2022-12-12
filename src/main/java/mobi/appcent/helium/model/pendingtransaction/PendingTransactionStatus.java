package mobi.appcent.helium.model.pendingtransaction;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.txn.Txn;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class PendingTransactionStatus {
    @SerializedName("updated_at")
    private String updatedAt;
    private String type;
    private Txn txn;
    private String status;
    private String hash;
    @SerializedName("failed_reason")
    private String failedReason;
    @SerializedName("created_at")
    private String createdAt;
}
