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
    protected HeliumSdkClient sdkClient;

    protected void setSdkClient(HeliumSdkClient sdkClient) {
        this.sdkClient = sdkClient;
    }
}
