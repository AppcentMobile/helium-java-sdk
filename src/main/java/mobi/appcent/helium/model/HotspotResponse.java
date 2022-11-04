package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class HotspotResponse {
    public Hotspot getData() {
        return data;
    }

    public void setData(Hotspot data) {
        this.data = data;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    private Hotspot data;
    private String cursor;

    public HotspotResponse(Hotspot data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }
}
