package mobi.appcent.helium.model.city;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class City {
    @SerializedName("city_id")
    public String cityId;
    @SerializedName("hotspot_count")
    public Integer hotspotCount;
    @SerializedName("long_city")
    public String longCity;
    @SerializedName("long_country")
    public String longCountry;
    @SerializedName("long_state")
    public String longState;
    @SerializedName("short_city")
    public String shortCity;
    @SerializedName("short_country")
    public String shortCountry;
    @SerializedName("short_state")
    public String shortState;
}