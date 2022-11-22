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
    private String timestamp;
    private String online;
    @SerializedName("listen_addrs")
    private List<String> listenAddrs;
    private BigInteger height;
    @SerializedName("grpc_addr")
    private String grpcAddr;
}