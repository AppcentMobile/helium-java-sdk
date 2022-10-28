package mobi.appcent.helium.httpClient;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;


public class HttpClient {
    private final OkHttpClient httpClient;

    private HttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.level(HttpLoggingInterceptor.Level.BASIC);
        httpClient = new OkHttpClient().newBuilder()
                .addInterceptor(logging)
                .addInterceptor(chain -> {
                    Request originalRequest = chain.request();
                    Request.Builder builder = originalRequest.newBuilder().header("User-agent", "user-agent");
                    Request newRequest = builder.build();
                    return chain.proceed(newRequest);
                }).build();
    }

    public static OkHttpClient client() {
        return new HttpClient().httpClient;
    }

}
