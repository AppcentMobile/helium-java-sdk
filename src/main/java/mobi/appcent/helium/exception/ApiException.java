package mobi.appcent.helium.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

/**
 * Created by erenalpaslan on 10.12.2022
 */
@Setter
@Getter
@NoArgsConstructor
public class ApiException extends Exception{

    private Integer code;
    private String path;
    private String httpMethod;

    public ApiException(Throwable t) {
        super(t);
    }

    public ApiException(Throwable t, String path, String httpMethod) {
        super(t);
        this.code = code;
        this.path = path;
        this.httpMethod = httpMethod;
    }

    public ApiException(Throwable t, String errorMessage) {
        super(errorMessage, t);
    }

    public ApiException(Integer code, Throwable throwable, String errorMessage) {
        super(errorMessage, throwable);
        this.code = code;
    }

    public ApiException(Integer code, String errorMessage) {
        super(errorMessage);
        this.code = code;
    }

    @Override
    public String toString() {
        return "Code: "+ code + "\n"
                + "HttpMethod: " + httpMethod + "\n"
                + "Path: " + path + "\n"
                + "Message: " + this.getMessage();
    }
}
