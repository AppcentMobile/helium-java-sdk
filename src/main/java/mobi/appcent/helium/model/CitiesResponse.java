package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class CitiesResponse {
    private List<City> data;
    private String cursor;

    public CitiesResponse(List<City> data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }

    public List<City> getData() {
        return data;
    }

    public void setData(List<City> data) {
        this.data = data;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
}
