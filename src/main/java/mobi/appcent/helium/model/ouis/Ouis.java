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
    public List<Subnet> subnets;
    public String owner;
    public Integer nonce;
    public Integer oui;
    public Integer block;
    public List<String> addresses;
}
