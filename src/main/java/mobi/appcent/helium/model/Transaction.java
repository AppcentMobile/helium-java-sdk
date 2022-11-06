package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 5.11.2022
 */
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
