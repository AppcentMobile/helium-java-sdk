package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class Election {
    private int delay;
    private String hash;
    private int height;
    private String[] members;
    private String proof;
    private String time;
    private String type;

    public Election(int delay, String hash, int height, String[] members, String proof, String time, String type) {
        this.delay = delay;
        this.hash = hash;
        this.height = height;
        this.members = members;
        this.proof = proof;
        this.time = time;
        this.type = type;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    public String getProof() {
        return proof;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
