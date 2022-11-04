package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 4.11.2022
 */
public class Pair <T, U> {
    public Pair(T key, U value) {
        this.value = value;
        this.key = key;
    }

    public final T key;
    public final U value;

    public static <T, U> Pair<T, U> create(T first, U second) {
        return new Pair<>(first, second);
    }

    public T getKey() {
        return key;
    }

    public U getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}
