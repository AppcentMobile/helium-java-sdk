package mobi.appcent.helium.api;

import mobi.appcent.helium.request.election.ListOfElectionsRequest;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class ElectionsApi extends BaseApi implements IElectionsApi{

    public static ElectionsApi getInstance() {
        return new ElectionsApi();
    }

    @Override
    public ListOfElectionsRequest getListOfElections() {
        return new ListOfElectionsRequest(sdkClient);
    }
}
