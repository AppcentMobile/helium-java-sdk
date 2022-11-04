package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

public class Hotspot {
    @SerializedName(value = "score_update_height")
    private int scoreUpdateHeight;
    private int score;
    private String owner;
    private String name;
    private int nonce;
    @SerializedName(value = "reward_scale")
    private float rewardScale;
    private String payer;
    private String location;
    @SerializedName(value = "location_hex")
    private String locationHex;
    private float lng;
    private float lat;
    private long block;
    private Geocode geocode;
    private String address;
    private Status status;
    @SerializedName(value = "speculative_nonce")
    private int speculativeNonce;
    @SerializedName(value = "block_added")
    private long blockAdded;
    @SerializedName(value = "timestamp_added")
    private String timestampAdded;
    @SerializedName(value = "last_poc_challenge")
    private int lastPocChallenge;
    @SerializedName(value = "last_change_block")
    private int lastChangeBlock;
    private int gain;
    private int elevation;
    private String mode;

    public int getScoreUpdateHeight() {
        return scoreUpdateHeight;
    }

    public void setScoreUpdateHeight(int scoreUpdateHeight) {
        this.scoreUpdateHeight = scoreUpdateHeight;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public float getRewardScale() {
        return rewardScale;
    }

    public void setRewardScale(float rewardScale) {
        this.rewardScale = rewardScale;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationHex() {
        return locationHex;
    }

    public void setLocationHex(String locationHex) {
        this.locationHex = locationHex;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public long getBlock() {
        return block;
    }

    public void setBlock(long block) {
        this.block = block;
    }

    public Geocode getGeocode() {
        return geocode;
    }

    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getSpeculativeNonce() {
        return speculativeNonce;
    }

    public void setSpeculativeNonce(int speculativeNonce) {
        this.speculativeNonce = speculativeNonce;
    }

    public long getBlockAdded() {
        return blockAdded;
    }

    public void setBlockAdded(long blockAdded) {
        this.blockAdded = blockAdded;
    }

    public String getTimestampAdded() {
        return timestampAdded;
    }

    public void setTimestampAdded(String timestampAdded) {
        this.timestampAdded = timestampAdded;
    }

    public int getLastPocChallenge() {
        return lastPocChallenge;
    }

    public void setLastPocChallenge(int lastPocChallenge) {
        this.lastPocChallenge = lastPocChallenge;
    }

    public int getLastChangeBlock() {
        return lastChangeBlock;
    }

    public void setLastChangeBlock(int lastChangeBlock) {
        this.lastChangeBlock = lastChangeBlock;
    }

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Hotspot(int scoreUpdateHeight, int score, String owner, String name, int nonce, float rewardScale, String payer, String location, String locationHex, float lng, float lat, long block, Geocode geocode, String address, Status status, int speculativeNonce, long blockAdded, String timestampAdded, int lastPocChallenge, int lastChangeBlock, int gain, int elevation, String mode) {
        this.scoreUpdateHeight = scoreUpdateHeight;
        this.score = score;
        this.owner = owner;
        this.name = name;
        this.nonce = nonce;
        this.rewardScale = rewardScale;
        this.payer = payer;
        this.location = location;
        this.locationHex = locationHex;
        this.lng = lng;
        this.lat = lat;
        this.block = block;
        this.geocode = geocode;
        this.address = address;
        this.status = status;
        this.speculativeNonce = speculativeNonce;
        this.blockAdded = blockAdded;
        this.timestampAdded = timestampAdded;
        this.lastPocChallenge = lastPocChallenge;
        this.lastChangeBlock = lastChangeBlock;
        this.gain = gain;
        this.elevation = elevation;
        this.mode = mode;
    }
}

