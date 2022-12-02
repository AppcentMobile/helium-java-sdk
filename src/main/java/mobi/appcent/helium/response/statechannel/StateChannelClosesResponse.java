package mobi.appcent.helium.response.statechannel;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.statechannel.StateChannelCloseTransaction;

import java.util.List;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class StateChannelClosesResponse {
    private List<StateChannelCloseTransaction> data;
    private String cursor;
}
