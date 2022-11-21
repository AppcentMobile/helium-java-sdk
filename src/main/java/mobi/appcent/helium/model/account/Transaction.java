package mobi.appcent.helium.model.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.account.Txn;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class Transaction {
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
