package mobi.appcent.helium.response.hotspot;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.role.RoleCount;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class HotspotsRolesCountResponse {
    public RoleCount data;
}
