package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 7.11.2022
 */
public class ValidatorsResponse {
    private List<Validator> data;
    private String cursor;

    public ValidatorsResponse(List<Validator> data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }

    public List<Validator> getData() {
        return data;
    }

    public String getCursor() {
        return cursor;
    }
}
