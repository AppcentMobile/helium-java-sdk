package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public class AccountRolesCountResponse {
    private final AccountRolesCount data;

    public AccountRolesCountResponse(AccountRolesCount data) {
        this.data = data;
    }

    public AccountRolesCount getData() {
        return data;
    }
}
