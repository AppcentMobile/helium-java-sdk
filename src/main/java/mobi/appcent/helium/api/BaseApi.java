package mobi.appcent.helium.api;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import mobi.appcent.helium.HeliumSdkClient;
import okhttp3.Call;
import okhttp3.Response;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;

/**
 * Base class for apis
 */
abstract class BaseApi {
    private static final Gson gson = new Gson();
    protected static final String BASE_URL = "https://api.helium.io/v1";

    abstract String path();

    protected HeliumSdkClient sdkClient;

    protected void setSdkClient(HeliumSdkClient sdkClient) {
        this.sdkClient = sdkClient;
    }

    protected  <T> T execute(Call call, Type returnType) throws IOException {
        try {
            Response response = call.execute();
            return handleResponse(response, returnType);
        } catch (IOException e) {
            throw new IOException("Error");
        }
    }

    //TODO: Handle Error
    private <T> T handleResponse(Response response, Type returnType) throws IOException {
        if(response.isSuccessful()) {
            if (response.body() != null) {
                return deserialize(response.body().string(), returnType);
            }
        }
        return null;
    }

    public static <T> T deserialize(String body, Type returnType) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(body));
            // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
            jsonReader.setLenient(true);
            return gson.fromJson(jsonReader, returnType);
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }
}
