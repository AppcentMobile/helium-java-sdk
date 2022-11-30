package mobi.appcent.helium.response.ouis;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.ouis.Ouis;

import java.util.List;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class ListOfOUIsResponse {
    private List<Ouis> data;
    private String cursor;
}
