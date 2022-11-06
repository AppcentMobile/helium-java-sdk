package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public class AccountResponse {
    private final Account data;

    public AccountResponse(Account data) {
        this.data = data;
    }

    public Account getData() {
        return data;
    }
}
