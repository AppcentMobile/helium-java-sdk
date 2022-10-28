package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class HotspotRolesResponse {
    private List<Role> data;

    public HotspotRolesResponse(List<Role> data) {
        this.data = data;
    }

    public List<Role> getData() {
        return data;
    }

    public void setData(List<Role> data) {
        this.data = data;
    }
}
