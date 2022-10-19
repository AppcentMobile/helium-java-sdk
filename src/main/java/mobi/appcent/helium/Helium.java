package mobi.appcent.helium;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mobi.appcent.helium.api.HotspotApi;
import mobi.appcent.helium.client.Hotspot;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Helium {
    private Helium(){

    }

    public static Hotspot hotspot() throws IOException {
        return Client.hotspot();
    }
}
