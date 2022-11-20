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
