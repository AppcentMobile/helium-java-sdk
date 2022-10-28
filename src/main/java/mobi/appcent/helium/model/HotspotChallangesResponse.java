package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class HotspotChallangesResponse {
    private List<Challange> data;
    private String cursor;

    public HotspotChallangesResponse(List<Challange> data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }

    public List<Challange> getData() {
        return data;
    }

    public void setData(List<Challange> data) {
        this.data = data;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
}
