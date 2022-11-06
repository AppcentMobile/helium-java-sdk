package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public class AccountTransactionsResponse {
    private final List<Transaction> data;

    public AccountTransactionsResponse(List<Transaction> data) {
        this.data = data;
    }

    public List<Transaction> getData() {
        return data;
    }
}
