package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.response.validator.ValidatorsRewardsTotalResponse;
import mobi.appcent.helium.request.BaseRequest;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class RewardTotalForAllValidatorsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private final String minTime;
    private final String maxTime;

    public RewardTotalForAllValidatorsRequest(HeliumSdkClient client, String address, String minTime, String maxTime) {
        this.client = client;
        this.address = address;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public ValidatorsRewardsTotalResponse execute() throws ApiException {
        String path = UrlConstant.VALIDATORS_PATH + "/"+ address +"/sum";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ValidatorsRewardsTotalResponse.class).getType();
        return execute(call, type);
    }
}
