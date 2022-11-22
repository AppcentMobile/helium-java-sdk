package mobi.appcent.helium.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 4.11.2022
 */
@Data
@AllArgsConstructor
public class Pair <T, U> {
    public final T key;
    public final U value;

    public static <T, U> Pair<T, U> create(T first, U second) {
        return new Pair<>(first, second);
    }


}
