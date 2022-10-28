package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class HotspotElectionsResponse {
    private List<Election> data;

    public HotspotElectionsResponse(List<Election> data) {
        this.data = data;
    }

    public List<Election> getData() {
        return data;
    }

    public void setData(List<Election> data) {
        this.data = data;
    }
}
