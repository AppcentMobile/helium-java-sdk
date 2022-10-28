package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class Role {
    public Role(String type, String time, String role, int height, String hash) {
        this.type = type;
        this.time = time;
        this.role = role;
        this.height = height;
        this.hash = hash;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    private String type;
    private String time;
    private String role;
    private int height;
    private String hash;
}
