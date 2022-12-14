package mobi.appcent.helium.api;

import mobi.appcent.helium.request.statechannel.StateChannelClosesRequest;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class StateChannelsApi extends BaseApi implements IStateChannelsApi{

    public static StateChannelsApi getInstance() {
        return new StateChannelsApi();
    }

    @Override
    public StateChannelClosesRequest getStateChannelCloses() {
        return new StateChannelClosesRequest(sdkClient);
    }
}
