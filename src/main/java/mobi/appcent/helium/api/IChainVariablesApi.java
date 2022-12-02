package mobi.appcent.helium.api;

import mobi.appcent.helium.request.chainvariable.ChainVariablesRequest;
import mobi.appcent.helium.request.chainvariable.ListOfChainVariableActivityRequest;
import mobi.appcent.helium.request.chainvariable.ValueOfAChainVariableRequest;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public interface IChainVariablesApi {
    ChainVariablesRequest getChainVariables();
    ValueOfAChainVariableRequest getValueOfAChainVariable(String name);
    ListOfChainVariableActivityRequest getListOfChainVariableActivity();
}
