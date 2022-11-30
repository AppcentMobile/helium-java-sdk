package mobi.appcent.helium.api;

import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.request.chainvariable.ChainVariablesRequest;
import mobi.appcent.helium.request.chainvariable.ListOfChainVariableActivityRequest;
import mobi.appcent.helium.request.chainvariable.ValueOfAChainVariableRequest;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class ChainVariablesApi extends BaseApi implements IChainVariablesApi{
    @Override
    String path() {
        return UrlConstant.CHAIN_VARIABLES_PATH;
    }

    public static ChainVariablesApi getInstance() {
        return new ChainVariablesApi();
    }

    @Override
    public ChainVariablesRequest getChainVariables() {
        return new ChainVariablesRequest(sdkClient);
    }

    @Override
    public ValueOfAChainVariableRequest getValueOfAChainVariable(String name) {
        return new ValueOfAChainVariableRequest(sdkClient, name);
    }

    @Override
    public ListOfChainVariableActivityRequest getListOfChainVariableActivity() {
        return new ListOfChainVariableActivityRequest(sdkClient);
    }
}
