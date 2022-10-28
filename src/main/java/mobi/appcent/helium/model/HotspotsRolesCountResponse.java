package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class HotspotsRolesCountResponse {
    private RoleCount data;

    public HotspotsRolesCountResponse(RoleCount data) {
        this.data = data;
    }

    public RoleCount getData() {
        return data;
    }

    public void setData(RoleCount data) {
        this.data = data;
    }
}
