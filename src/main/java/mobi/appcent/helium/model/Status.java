package mobi.appcent.helium.model;

public class Status {
    private String timestamp;
    private String height;
    private String online;
    private String[] listenAddrs;

    public Status(String timestamp, String height, String online, String[] listenAddrs) {
        this.timestamp = timestamp;
        this.height = height;
        this.online = online;
        this.listenAddrs = listenAddrs;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String[] getListenAddrs() {
        return listenAddrs;
    }

    public void setListenAddrs(String[] listenAddrs) {
        this.listenAddrs = listenAddrs;
    }
}
