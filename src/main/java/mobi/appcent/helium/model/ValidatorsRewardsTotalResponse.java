package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 8.11.2022
 */
public class ValidatorsRewardsTotalResponse {
    private ValidatorsRewardsTotal data;
    private ValidatorsRewardsTotalMeta meta;

    public ValidatorsRewardsTotalResponse(ValidatorsRewardsTotal data, ValidatorsRewardsTotalMeta meta) {
        this.data = data;
        this.meta = meta;
    }

    public ValidatorsRewardsTotal getData() {
        return data;
    }

    public ValidatorsRewardsTotalMeta getMeta() {
        return meta;
    }
}
