package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class City {
    @SerializedName("city_id")
    public String cityId;
    @SerializedName("hotspot_count")
    public int hotspotCount;
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