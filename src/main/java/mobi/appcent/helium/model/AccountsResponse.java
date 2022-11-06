package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public class AccountsResponse {
    public final List<Account> data;
    public final String cursor;

    public AccountsResponse(List<Account> data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }

    public List<Account> getData() {
        return data;
    }

    public String getCursor() {
        return cursor;
    }
}
