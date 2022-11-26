package mobi.appcent.helium.model.chainvariable;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class ChainVariable {
    @SerializedName("h3_neighbor_res")
    private Integer h3NeighborRes;

    @SerializedName("hip17_res_5")
    private List<Integer> hip17Res5;

    @SerializedName("dc_percent")
    private Double dcPercent;

    @SerializedName("election_seen_penalty")
    private Double electionSeenPenalty;

    @SerializedName("net_emissions_max_rate")
    private BigInteger netEmissionsMaxRate;

    @SerializedName("poc_target_hex_parent_res")
    private Integer pocTargetHexParentRes;

    @SerializedName("poc_v4_prob_time_wt")
    private Integer pocV4ProbTimeWt;

    @SerializedName("deprecate_security_exchange_v1")
    private Boolean deprecateSecurityExchangeV1;

    @SerializedName("sc_gc_Integererval")
    private Integer scGcIntegererval;

    @SerializedName("poc_path_limit")
    private Integer pocPathLimit;

    @SerializedName("batch_size")
    private Integer batchSize;

    @SerializedName("election_restart_Integererval")
    private Integer electionRestartIntegererval;

    @SerializedName("staking_fee_txn_oui_v1")
    private Integer stakingFeeTxnOuiV1;

    @SerializedName("staking_fee_txn_assert_location_v1")
    private Integer stakingFeeTxnAssertLocationV1;

    @SerializedName("beta_decay")
    private Double betaDecay;

    @SerializedName("net_emissions_enabled")
    private Boolean netEmissionsEnabled;

    @SerializedName("poc_proposal_gc_window_check")
    private Boolean pocProposalGcWindowCheck;

    @SerializedName("poc_v4_target_exclusion_cells")
    private Integer pocV4TargetExclusionCells;

    @SerializedName("density_tgt_res")
    private Integer densityTgtRes;

    @SerializedName("predicate_callback_mod")
    private String predicateCallbackMod;

    @SerializedName("sc_dispute_strategy_version")
    private Integer scDisputeStrategyVersion;

    @SerializedName("poc_distance_limit")
    private Integer pocDistanceLimit;

    @SerializedName("sc_max_actors")
    private Integer scMaxActors;

    @SerializedName("var_gw_inactivity_threshold")
    private Integer varGwInactivityThreshold;

    @SerializedName("min_assert_h3_res")
    private Integer minAssertH3Res;

    @SerializedName("election_selection_pct")
    private Integer electionSelectionPct;

    @SerializedName("allowed_num_reward_server_keys")
    private Integer allowedNumRewardServerKeys;

    @SerializedName("snapshot_Integererval")
    private Integer snapshotIntegererval;

    @SerializedName("h3_max_grid_distance")
    private Integer h3MaxGridDistance;

    @SerializedName("max_payments")
    private Integer maxPayments;

    @SerializedName("poc_v4_prob_count_wt")
    private Integer pocV4ProbCountWt;

    @SerializedName("poc_hexing_type")
    private String pocHexingType;

    @SerializedName("poc_reject_empty_receipts")
    private Boolean pocRejectEmptyReceipts;

    @SerializedName("hip17_res_11")
    private List<Integer> hip17Res11;

    @SerializedName("election_penalty_history_percentage")
    private Double electionPenaltyHistoryPercentage;

    @SerializedName("staking_fee_txn_assert_location_dataonly_gateway_v1")
    private Integer stakingFeeTxnAssertLocationDataonlyGatewayV1;

    @SerializedName("poc_receipts_absorb_timeout")
    private Integer pocReceiptsAbsorbTimeout;

    @SerializedName("hip17_res_10")
    private List<Integer> hip17Res10;

    @SerializedName("stake_withdrawal_max")
    private Integer stakeWithdrawalMax;

    @SerializedName("hip17_Integereractivity_blocks")
    private Integer hip17IntegereractivityBlocks;

    @SerializedName("predicate_callback_fun")
    private String predicateCallbackFun;

    @SerializedName("poc_v4_exclusion_cells")
    private Integer pocV4ExclusionCells;

    @SerializedName("poc_challenger_type")
    private String pocChallengerType;

    @SerializedName("staking_keys")
    private List<String> stakingKeys;

    @SerializedName("poc_proposals_selector_retry_scale_factor")
    private Double pocProposalsSelectorRetryScaleFactor;

    @SerializedName("poc_target_hex_collection_res")
    private Integer pocTargetHexCollectionRes;

    @SerializedName("price_oracle_private_keys")
    private List<String> priceOracleprivateKeys;

    @SerializedName("poc_validator_ct_scale")
    private Double pocValidatorCtScale;

    @SerializedName("data_aggregation_version")
    private Integer dataAggregationVersion;

    @SerializedName("num_consensus_members")
    private Integer numConsensusMembers;

    @SerializedName("poc_addr_hash_byte_count")
    private Integer pocAddrHashByteCount;

    @SerializedName("h3dex_targeting_lookup_fix")
    private Boolean h3dexTargetingLookupFix;

    @SerializedName("poc_typo_fixes")
    private Boolean pocTypoFixes;

    @SerializedName("transaction_validity_version")
    private Integer transactionValidityVersion;

    @SerializedName("validator_penalty_filter")
    private Integer validatorPenaltyFilter;

    @SerializedName("poc_witness_consideration_limit")
    private Integer pocWitnessConsiderationLimit;

    @SerializedName("enable_balance_clearing")
    private Boolean enableBalanceClearing;

    @SerializedName("dkg_penalty")
    private Integer dkgPenalty;

    @SerializedName("poc_per_hop_max_witnesses")
    private Integer pocPerHopMaxWitnesses;

    @SerializedName("token_version")
    private Integer tokenVersion;

    @SerializedName("max_open_sc")
    private Integer maxOpenSc;

    //TODO: Handle mapping
    /*
    @SerializedName("staking_keys_to_mode_mappings")
    private String stakingKeysToModeMappings;
    */

    @SerializedName("regulatory_regions")
    private String regulatoryRegions;

    @SerializedName("chain_vars_version")
    private Integer chainVarsVersion;

    @SerializedName("poc_v4_target_score_curve")
    private Integer pocV4TargetScoreCurve;

    @SerializedName("poc_target_pool_size")
    private Integer pocTargetPoolSize;

    @SerializedName("transfer_hotspot_stale_poc_blocks")
    private Integer transferHotspotStalePocBlocks;

    @SerializedName("txn_routing_update_xor_fees_version")
    private Integer txnRoutingUpdateXorFeesVersion;

    @SerializedName("allow_payment_v2_memos")
    private Boolean allowPaymentV2Memos;

    @SerializedName("poc_v4_prob_good_rssi")
    private Integer pocV4ProbGoodRssi;

    @SerializedName("min_subnet_size")
    private Integer minSubnetSize;

    @SerializedName("predicate_threshold")
    private Double predicateThreshold;

    @SerializedName("poc_good_bucket_high")
    private Integer pocGoodBucketHigh;

    @SerializedName("staking_fee_txn_add_dataonly_gateway_v1")
    private Integer stakingFeeTxnAddDataonlyGatewayV1;

    @SerializedName("election_bba_penalty")
    private Double electionBbaPenalty;

    @SerializedName("poc_apply_gc_fix")
    private Boolean pocApplyGcFix;

    @SerializedName("election_cluster_res")
    private Integer electionClusterRes;

    @SerializedName("poc_centrality_wt")
    private Double pocCentralityWt;

    @SerializedName("hip17_res_1")
    private List<Integer> hip17Res1;

    @SerializedName("txn_fee_multiplier")
    private Integer txnFeeMultiplier;

    @SerializedName("poc_v4_parent_res")
    private Integer pocV4ParentRes;

    @SerializedName("sc_overcommit")
    private Integer scOvercommit;

    @SerializedName("ledger_entry_version")
    private Integer ledgerEntryVersion;

    @SerializedName("poc_v4_target_prob_edge_wt")
    private Integer pocV4TargetProbEdgeWt;

    @SerializedName("validator_version")
    private Integer validatorVersion;

    @SerializedName("security_zero_reward_bugfix")
    private Boolean securityZeroRewardBugfix;

    @SerializedName("witness_refresh_Integererval")
    private Integer witnessRefreshIntegererval;

    @SerializedName("staking_fee_txn_add_light_gateway_v1")
    private Integer stakingFeeTxnAddLightGatewayV1;

    @SerializedName("validator_liveness_Integererval")
    private Integer validatorLivenessIntegererval;

    @SerializedName("sc_version")
    private Integer scVersion;

    @SerializedName("validator_liveness_grace_period")
    private Integer validatorLivenessGracePeriod;

    @SerializedName("txn_fees")
    private Boolean txnFees;

    @SerializedName("poc_challengers_percent")
    private Double pocChallengersPercent;

    @SerializedName("block_size_limit")
    private Integer blockSizeLimit;

    @SerializedName("dkg_curve")
    private String dkgCurve;

    @SerializedName("consensus_percent")
    private Double consensusPercent;

    @SerializedName("full_gateway_capabilities_mask")
    private Integer fullGatewayCapabilitiesMask;

    @SerializedName("validator_minimum_stake")
    private BigInteger validatorMinimumStake;

    @SerializedName("poc_v4_target_challenge_age")
    private Integer pocV4TargetChallengeAge;

    @SerializedName("poc_good_bucket_low")
    private Integer pocGoodBucketLow;

    @SerializedName("election_replacement_slope")
    private Integer electionReplacementSlope;

    @SerializedName("poc_challenge_sync_Integererval")
    private Integer pocChallengeSyncIntegererval;

    @SerializedName("poc_activity_filter_enabled")
    private Boolean pocActivityFilterEnabled;

    @SerializedName("hip17_res_9")
    private List<Integer> hip17Res9;

    @SerializedName("dc_payload_size")
    private Integer dcPayloadSize;

    @SerializedName("price_oracle_refresh_Integererval")
    private Integer priceOracleRefreshIntegererval;

    @SerializedName("poc_timeout")
    private Integer pocTimeout;

    @SerializedName("rewards_txn_version")
    private Integer rewardsTxnVersion;

    @SerializedName("election_replacement_factor")
    private Integer electionReplacementFactor;

    @SerializedName("poc_v5_target_prob_randomness_wt")
    private Integer pocV5TargetProbRandomnessWt;

    @SerializedName("max_xor_filter_num")
    private Integer maxXorFilterNum;

    @SerializedName("election_removal_pct")
    private Integer electionRemovalPct;

    @SerializedName("staking_fee_txn_assert_location_light_gateway_v1")
    private Integer stakingFeeTxnAssertLocationLightGatewayV1;

    @SerializedName("poc_reward_decay_rate")
    private Double pocRewardDecayRate;

    @SerializedName("max_staleness")
    private Integer maxStaleness;

    @SerializedName("poc_challenge_rate")
    private Integer pocChallengeRate;

    @SerializedName("poc_challengees_percent")
    private Double pocChallengeesPercent;

    @SerializedName("allow_zero_amount")
    private Boolean allowZeroAmount;

    @SerializedName("sc_only_count_open_active")
    private Boolean scOnlyCountOpenActive;

    @SerializedName("block_time")
    private Integer blockTime;

    @SerializedName("dataonly_gateway_capabilities_mask")
    private Integer dataonlyGatewayCapabilitiesMask;

    @SerializedName("max_antenna_gain")
    private Integer maxAntennaGain;

    @SerializedName("validator_hb_reactivation_limit")
    private Integer validatorHbReactivationLimit;

    @SerializedName("hip17_res_8")
    private List<Integer> hip17Res8;

    @SerializedName("hip15_tx_reward_unit_cap")
    private Integer hip15TxRewardUnitCap;

    @SerializedName("stake_withdrawal_cooldown")
    private Integer stakeWithdrawalCooldown;

    @SerializedName("poc_validator_ephemeral_key_timeout")
    private Integer pocValidatorEphemeralKeyTimeout;

    @SerializedName("security_reward_bugfix")
    private Boolean securityRewardBugfix;

    @SerializedName("poc_challenge_Integererval")
    private Integer pocChallengeIntegererval;

    @SerializedName("hip17_res_12")
    private List<Integer> hip17Res12;

    @SerializedName("hip17_res_3")
    private List<Integer> hip17Res3;

    @SerializedName("hip17_res_6")
    private List<Integer> hip17Res6;

    @SerializedName("witness_refresh_rand_n")
    private Integer witnessRefreshRandN;

    @SerializedName("block_version")
    private String blockVersion;

    @SerializedName("poc_v4_randomness_wt")
    private Double pocV4RandomnessWt;

    @SerializedName("nonce")
    private Integer nonce;

    @SerializedName("election_Integererval")
    private Integer electionIntegererval;

    @SerializedName("max_subnet_num")
    private Integer maxSubnetNum;

    @SerializedName("reward_version")
    private Integer rewardVersion;

    @SerializedName("monthly_reward")
    private BigInteger monthlyReward;

    @SerializedName("poc_v4_prob_bad_rssi")
    private Double pocV4ProbBadRssi;

    @SerializedName("securities_percent")
    private Double securitiesPercent;

    @SerializedName("vars_commit_delay")
    private Integer varsCommitDelay;

    @SerializedName("validator_stale_heartbeat_check")
    private Boolean validatorStaleHeartbeatCheck;

    @SerializedName("sc_open_validation_bugfix")
    private Integer scOpenValidationBugfix;

    @SerializedName("election_restart_Integererval_range")
    private Integer electionRestartIntegerervalRange;

    @SerializedName("penalty_history_limit")
    private Integer penaltyHistoryLimit;

    @SerializedName("poc_targeting_version")
    private Integer pocTargetingVersion;

    @SerializedName("max_subnet_size")
    private Integer maxSubnetSize;

    @SerializedName("snapshot_version")
    private Integer snapshotVersion;

    @SerializedName("poc_version")
    private Integer pocVersion;

    @SerializedName("light_gateway_capabilities_mask")
    private Integer lightGatewayCapabilitiesMask;

    @SerializedName("poc_v4_target_prob_score_wt")
    private Integer pocV4TargetProbScoreWt;

    @SerializedName("tenure_penalty")
    private Double tenurePenalty;

    @SerializedName("alpha_decay")
    private Double alphaDecay;

    @SerializedName("sc_grace_blocks")
    private Integer scGraceBlocks;

    @SerializedName("witness_redundancy")
    private Integer witnessRedundancy;

    @SerializedName("harmonize_activity_on_hip17_Integereractivity_blocks")
    private Boolean harmonizeActivityOnHip17IntegereractivityBlocks;

    @SerializedName("sc_causality_fix")
    private Integer scCausalityFix;

    @SerializedName("max_xor_filter_size")
    private Integer maxXorFilterSize;

    @SerializedName("price_oracle_price_scan_delay")
    private Integer priceOraclePriceScanDelay;

    @SerializedName("hip17_res_2")
    private List<Integer> hip17Res2;

    @SerializedName("hip17_res_7")
    private List<Integer> hip17Res7;

    @SerializedName("poc_v4_prob_rssi_wt")
    private Integer pocV4ProbRssiWt;

    @SerializedName("price_oracle_height_delta")
    private Integer priceOracleHeightDelta;

    @SerializedName("assert_loc_txn_version")
    private Integer assertLocTxnVersion;

    @SerializedName("poc_always_process_reactivations")
    private Boolean pocAlwaysProcessReactivations;

    @SerializedName("poc_receipt_witness_validation")
    private Boolean pocReceiptWitnessValidation;

    @SerializedName("price_oracle_price_scan_max")
    private Integer priceOraclePriceScanMax;

    @SerializedName("min_score")
    private Double minScore;

    @SerializedName("staking_fee_txn_oui_v1_per_address")
    private Integer stakingFeeTxnOuiV1PerAddress;

    @SerializedName("hip17_res_4")
    private List<Integer> hip17Res4;

    @SerializedName("min_antenna_gain")
    private Integer minAntennaGain;

    @SerializedName("min_expire_within")
    private Integer minExpireWithin;

    @SerializedName("h3_exclusion_ring_dist")
    private Integer h3ExclusionRingDist;

    @SerializedName("fspl_loss")
    private Integer fsplLoss;

    @SerializedName("hip17_res_0")
    private List<Integer> hip17Res0;

    @SerializedName("election_version")
    private Integer electionVersion;

    @SerializedName("poc_v4_prob_no_rssi")
    private Double pocV4ProbNoRssi;

    @SerializedName("poc_max_hop_cells")
    private Integer pocMaxHopCells;

    @SerializedName("poc_witnesses_percent")
    private Double pocWitnessesPercent;

    @SerializedName("h3dex_gc_width")
    private Integer h3dexGcWidth;

    @SerializedName("staking_fee_txn_add_gateway_v1")
    private Integer stakingFeeTxnAddGatewayV1;

}
