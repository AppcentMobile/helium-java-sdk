package mobi.appcent.helium.response.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.account.Account;

import java.util.List;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class AccountsResponse {
    private List<Account> data;
    private String cursor;
}
