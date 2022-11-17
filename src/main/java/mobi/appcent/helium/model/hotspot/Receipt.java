package mobi.appcent.helium.model.hotspot;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class Receipt {
    private String timestamp;
    private Integer signal;
    private String origin;
    private String gateway;
    private String data;
}
