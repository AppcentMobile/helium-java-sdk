package mobi.appcent.helium.model.pendingTransaction;

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
    public String updatedAt;
    public String type;
    public Txn txn;
    public String status;
    public String hash;
    @SerializedName("failed_reason")
    public String failedReason;
    @SerializedName("created_at")
    public String createdAt;
}
