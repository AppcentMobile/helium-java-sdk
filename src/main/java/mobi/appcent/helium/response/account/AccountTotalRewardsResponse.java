package mobi.appcent.helium.response.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.response.Meta;
import mobi.appcent.helium.model.account.AccountTotalReward;

import java.util.List;

/**
 * Created by erenalpaslan on 19.11.2022
 */
@Data
@AllArgsConstructor
public class AccountTotalRewardsResponse {
    public List<AccountTotalReward> data;
    public Meta meta;
}
