package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public class OuisResponse {
    private final Ouis data;

    public OuisResponse(Ouis data) {
        this.data = data;
    }

    public Ouis getData() {
        return data;
    }
}
