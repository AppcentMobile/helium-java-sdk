package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class Witness {
    private String timestamp;
    private int signal;
    @SerializedName("packet_hash")
    private String packetHash;
    private String owner;
    private String location;
    private String gateway;

    public Witness(String timestamp, int signal, String packetHash, String owner, String location, String gateway) {
        this.timestamp = timestamp;
        this.signal = signal;
        this.packetHash = packetHash;
        this.owner = owner;
        this.location = location;
        this.gateway = gateway;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    public String getPacketHash() {
        return packetHash;
    }

    public void setPacketHash(String packetHash) {
        this.packetHash = packetHash;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
}
