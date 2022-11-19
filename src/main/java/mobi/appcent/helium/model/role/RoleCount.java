package mobi.appcent.helium.model.role;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class RoleCount {
    @SerializedName("assert_location_v1")
    private String assertLocationV1;
}
