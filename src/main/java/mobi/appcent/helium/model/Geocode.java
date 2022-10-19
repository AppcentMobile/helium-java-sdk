package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

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

    public Geocode(String shortStreet, String shortState, String shortCountry, String shortCity, String longStreet, String longState, String longCountry, String longCity, String cityId) {
        this.shortStreet = shortStreet;
        this.shortState = shortState;
        this.shortCountry = shortCountry;
        this.shortCity = shortCity;
        this.longStreet = longStreet;
        this.longState = longState;
        this.longCountry = longCountry;
        this.longCity = longCity;
        this.cityId = cityId;
    }

    public String getShortStreet() {
        return shortStreet;
    }

    public void setShortStreet(String shortStreet) {
        this.shortStreet = shortStreet;
    }

    public String getShortState() {
        return shortState;
    }

    public void setShortState(String shortState) {
        this.shortState = shortState;
    }

    public String getShortCountry() {
        return shortCountry;
    }

    public void setShortCountry(String shortCountry) {
        this.shortCountry = shortCountry;
    }

    public String getShortCity() {
        return shortCity;
    }

    public void setShortCity(String shortCity) {
        this.shortCity = shortCity;
    }

    public String getLongStreet() {
        return longStreet;
    }

    public void setLongStreet(String longStreet) {
        this.longStreet = longStreet;
    }

    public String getLongState() {
        return longState;
    }

    public void setLongState(String longState) {
        this.longState = longState;
    }

    public String getLongCountry() {
        return longCountry;
    }

    public void setLongCountry(String longCountry) {
        this.longCountry = longCountry;
    }

    public String getLongCity() {
        return longCity;
    }

    public void setLongCity(String longCity) {
        this.longCity = longCity;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
