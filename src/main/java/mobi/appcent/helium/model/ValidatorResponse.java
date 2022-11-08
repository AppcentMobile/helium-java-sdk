package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 7.11.2022
 */
public class ValidatorResponse {
    private Validator data;
    private String cursor;

    private ValidatorResponse(Validator data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }

    public Validator getData() {
        return data;
    }

    public String getCursor() {
        return cursor;
    }
}
