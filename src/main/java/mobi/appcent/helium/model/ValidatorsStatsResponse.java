package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 8.11.2022
 */
public class ValidatorsStatsResponse {
    private ValidatorsStats data;

    public ValidatorsStatsResponse(ValidatorsStats data) {
        this.data = data;
    }

    public ValidatorsStats getData() {
        return data;
    }
}
