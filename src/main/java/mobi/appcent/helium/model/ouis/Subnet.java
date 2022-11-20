package mobi.appcent.helium.model.ouis;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class Subnet {
    public Integer mask;
    public Integer base;
}
