package mobi.appcent.helium.model.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class AccountRolesCount {
    @SerializedName("gen_validator_v1")
    public Integer genValidatorV1;
    @SerializedName("transfer_validator_stake_v1")
    public Integer transferValidatorStakeV1;
    @SerializedName("security_exchange_v1")
    public Integer securityRxchangeV1;
    @SerializedName("consensus_group_failure_v1")
    public Integer consensusGroupFailureV1;
    @SerializedName("assert_location_v1")
    public Integer assertLocationV1;
    @SerializedName("payment_v1")
    public Integer paymentV1;
    @SerializedName("token_burn_v1")
    public Integer tokenBurnV1;
    @SerializedName("state_channel_close_v1")
    public Integer stateChannelCloseV1;
    @SerializedName("security_coinbase_v1")
    public Integer securityCoinbaseV1;
    @SerializedName("validator_heartbeat_v1")
    public Integer validatorHeartbeatV1;
    @SerializedName("transfer_hotspot_v2")
    public Integer transferHotspotV2;
    @SerializedName("gen_gateway_v1")
    public Integer genGatewayV1;
    @SerializedName("add_subnetwork_v1")
    public Integer addSubnetworkV1;
    @SerializedName("token_burn_exchange_rate_v1")
    public Integer tokenBurnExchangeRateV1;
    @SerializedName("coinbase_v1")
    public Integer coinbaseV1;
    @SerializedName("create_htlc_v1")
    public Integer createHtlcV1;
    @SerializedName("payment_v2")
    public Integer paymentV2;
    @SerializedName("transfer_hotspot_v1")
    public Integer transferHotspotV1;
    @SerializedName("subnetwork_rewards_v1")
    public Integer subnetworkRewardsV1;
    @SerializedName("price_oracle_v1")
    public Integer priceOracleV1;
    @SerializedName("stake_validator_v1")
    public Integer stakeValidatorV1;
    @SerializedName("state_channel_open_v1")
    public Integer stateChannelOpenV1;
    @SerializedName("rewards_v1")
    public Integer rewardsV1;
    @SerializedName("consensus_group_v1")
    public Integer consensusGroupV1;
    @SerializedName("poc_request_v1")
    public Integer pocRequestV1;
    @SerializedName("poc_receipts_v2")
    public Integer pocReceiptsV2;
    @SerializedName("dc_coinbase_v1")
    public Integer dcCoinbaseV1;
    @SerializedName("vars_v1")
    public Integer varsV1;
    @SerializedName("poc_receipts_v1")
    public Integer pocReceiptsV1;
    @SerializedName("add_gateway_v1")
    public Integer addGatewayV1;
    @SerializedName("redeem_htlc_v1")
    public Integer redeemHtlcV1;
    @SerializedName("rewards_v2")
    public Integer rewardsV2;
    @SerializedName("oui_v1")
    public Integer ouiV1;
    @SerializedName("assert_location_v2")
    public Integer assertLocationV2;
    @SerializedName("unstake_validator_v1")
    public Integer unstakeValidatorV1;
    @SerializedName("routing_v1")
    public Integer routingV1;
}
