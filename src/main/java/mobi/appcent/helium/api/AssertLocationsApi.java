package mobi.appcent.helium.api;

import mobi.appcent.helium.request.assertlocation.ListOfAssertLocationsRequest;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class AssertLocationsApi extends BaseApi implements IAssertLocationsAPI{

    public static AssertLocationsApi getInstance() {
        return new AssertLocationsApi();
    }

    @Override
    public ListOfAssertLocationsRequest getListOfAssertLocations() {
        return new ListOfAssertLocationsRequest(sdkClient);
    }
}
