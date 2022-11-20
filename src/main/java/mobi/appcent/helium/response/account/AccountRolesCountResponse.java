package mobi.appcent.helium.response.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.account.AccountRolesCount;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class AccountRolesCountResponse {
    public AccountRolesCount data;
}
