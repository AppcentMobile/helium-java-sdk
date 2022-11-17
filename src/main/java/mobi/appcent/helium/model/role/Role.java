package mobi.appcent.helium.model.role;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class Role {
    private String type;
    private String time;
    private String role;
    private Integer height;
    private String hash;
}
