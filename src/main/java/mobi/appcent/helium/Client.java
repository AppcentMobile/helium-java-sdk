package mobi.appcent.helium;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mobi.appcent.helium.client.Hotspot;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Client {
    private static final String BASE_API_URL= "https://api.helium.io/v1/";
    private static final OkHttpClient client = HttpClient.client(BASE_API_URL);

    public static <T> T buildRetrofit(Class<T> type){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_API_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(type);
    }

    public static Hotspot hotspot() throws IOException {
        return Hotspot.getInstance(buildRetrofit(mobi.appcent.helium.api.HotspotApi.class));
    }

}
