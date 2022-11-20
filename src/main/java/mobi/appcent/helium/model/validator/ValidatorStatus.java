package mobi.appcent.helium.model.validator;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by erenalpaslan on 19.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorStatus {
    public String timestamp;
    public String online;
    @SerializedName("listen_addrs")
    public List<String> listenAddrs;
    public BigInteger height;
    @SerializedName("grpc_addr")
    public String grpcAddr;
}