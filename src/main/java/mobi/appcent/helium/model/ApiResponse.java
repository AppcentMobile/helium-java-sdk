package mobi.appcent.helium.model;

import com.google.gson.Gson;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class ApiResponse <T> {
    public int getStatusCode() {
        return statusCode;
    }

    public T getData() {
        return data;
    }

    final private int statusCode;
    final private T data;

    public ApiResponse(int statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(data);
    }
}
