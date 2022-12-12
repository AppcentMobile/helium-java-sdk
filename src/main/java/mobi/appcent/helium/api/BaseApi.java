package mobi.appcent.helium.api;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.exception.ApiException;
import okhttp3.Call;
import okhttp3.Response;

import mobi.appcent.helium.exception.ApiException;

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

    protected  <T> T execute(Call call, Type returnType) throws ApiException {
        try {
            Response response = call.execute();
            return handleResponse(response, returnType);
        }catch (IOException ioException) {
            throw new ApiException(ioException);
        }catch (ApiException apiException) {
            apiException.setPath(call.request().url().url().toString());
            apiException.setHttpMethod(call.request().method());
            throw apiException;
        }

    }

    private <T> T handleResponse(Response response, Type returnType) throws IOException, ApiException {
        if(response.isSuccessful()) {
            if (response.body() != null) {
                return deserialize(response.body().string(), returnType);
            }else {
                throw new ApiException(response.code(), "Response body is empty");
            }
        }else {
            throw new ApiException(response.code(), response.message());
        }
    }

    public static <T> T deserialize(String body, Type returnType) throws ApiException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(body));
            // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
            jsonReader.setLenient(true);
            return gson.fromJson(jsonReader, returnType);
        } catch (JsonSyntaxException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                //TODO: Github issueya yönlendirilebilir.
                String message = returnType.getTypeName() + "seems doesn't match with the response model\n. Could you help us to resolve this issue please visit https://github.com/AppcentMobile/helium-java-sdk/issues and create a new issue so we can investigate and resolve as soon as possible";
                throw new ApiException(
                        e,
                        message
                );

            }
        }
    }
}
