package mobi.appcent.helium.model.hotspot;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Geocode {
    @SerializedName(value = "short_street")
    private String shortStreet;
    @SerializedName(value = "short_state")
    private String shortState;
    @SerializedName(value = "short_country")
    private String shortCountry;
    @SerializedName(value = "short_city")
    private String shortCity;
    @SerializedName(value = "long_street")
    private String longStreet;
    @SerializedName(value = "long_state")
    private String longState;
    @SerializedName(value = "long_country")
    private String longCountry;
    @SerializedName(value = "long_city")
    private String longCity;
    @SerializedName(value = "city_id")
    private String cityId;
}
