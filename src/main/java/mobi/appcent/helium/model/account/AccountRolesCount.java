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
    private Integer genValidatorV1;
    @SerializedName("transfer_validator_stake_v1")
    private Integer transferValidatorStakeV1;
    @SerializedName("security_exchange_v1")
    private Integer securityRxchangeV1;
    @SerializedName("consensus_group_failure_v1")
    private Integer consensusGroupFailureV1;
    @SerializedName("assert_location_v1")
    private Integer assertLocationV1;
    @SerializedName("payment_v1")
    private Integer paymentV1;
    @SerializedName("token_burn_v1")
    private Integer tokenBurnV1;
    @SerializedName("state_channel_close_v1")
    private Integer stateChannelCloseV1;
    @SerializedName("security_coinbase_v1")
    private Integer securityCoinbaseV1;
    @SerializedName("validator_heartbeat_v1")
    private Integer validatorHeartbeatV1;
    @SerializedName("transfer_hotspot_v2")
    private Integer transferHotspotV2;
    @SerializedName("gen_gateway_v1")
    private Integer genGatewayV1;
    @SerializedName("add_subnetwork_v1")
    private Integer addSubnetworkV1;
    @SerializedName("token_burn_exchange_rate_v1")
    private Integer tokenBurnExchangeRateV1;
    @SerializedName("coinbase_v1")
    private Integer coinbaseV1;
    @SerializedName("create_htlc_v1")
    private Integer createHtlcV1;
    @SerializedName("payment_v2")
    private Integer paymentV2;
    @SerializedName("transfer_hotspot_v1")
    private Integer transferHotspotV1;
    @SerializedName("subnetwork_rewards_v1")
    private Integer subnetworkRewardsV1;
    @SerializedName("price_oracle_v1")
    private Integer priceOracleV1;
    @SerializedName("stake_validator_v1")
    private Integer stakeValidatorV1;
    @SerializedName("state_channel_open_v1")
    private Integer stateChannelOpenV1;
    @SerializedName("rewards_v1")
    private Integer rewardsV1;
    @SerializedName("consensus_group_v1")
    private Integer consensusGroupV1;
    @SerializedName("poc_request_v1")
    private Integer pocRequestV1;
    @SerializedName("poc_receipts_v2")
    private Integer pocReceiptsV2;
    @SerializedName("dc_coinbase_v1")
    private Integer dcCoinbaseV1;
    @SerializedName("vars_v1")
    private Integer varsV1;
    @SerializedName("poc_receipts_v1")
    private Integer pocReceiptsV1;
    @SerializedName("add_gateway_v1")
    private Integer addGatewayV1;
    @SerializedName("redeem_htlc_v1")
    private Integer redeemHtlcV1;
    @SerializedName("rewards_v2")
    private Integer rewardsV2;
    @SerializedName("oui_v1")
    private Integer ouiV1;
    @SerializedName("assert_location_v2")
    private Integer assertLocationV2;
    @SerializedName("unstake_validator_v1")
    private Integer unstakeValidatorV1;
    @SerializedName("routing_v1")
    private Integer routingV1;
}
