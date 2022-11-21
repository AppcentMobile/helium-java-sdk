package mobi.appcent.helium.model.ouis;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class Ouis {
    private List<Subnet> subnets;
    private String owner;
    private Integer nonce;
    private Integer oui;
    private Integer block;
    private List<String> addresses;
}
