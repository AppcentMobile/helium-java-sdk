package mobi.appcent.helium.response.hotspot;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.role.Role;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class HotspotRolesResponse {
    public List<Role> data;
    public String cursor;
}
