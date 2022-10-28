package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class CityResponse {
    private City data;

    public CityResponse(City data) {
        this.data = data;
    }

    public City getData() {
        return data;
    }

    public void setData(City data) {
        this.data = data;
    }
}
