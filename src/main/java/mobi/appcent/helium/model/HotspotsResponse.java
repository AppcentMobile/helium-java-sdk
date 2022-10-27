package mobi.appcent.helium.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class HotspotsResponse {
    public List<Hotspot> getData() {
        return data;
    }

    public void setData(List<Hotspot> data) {
        this.data = data;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<Hotspot> data;
    public String cursor;

    public HotspotsResponse(List<Hotspot> data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }
}
