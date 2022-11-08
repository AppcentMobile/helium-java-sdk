package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by erenalpaslan on 7.11.2022
 */
public class ValidatorStatus {
    public String timestamp;
    public String online;
    @SerializedName("listen_addrs")
    public List<String> listenAddrs;
    public BigInteger height;
    @SerializedName("grpc_addr")
    public String grpcAddr;
}
