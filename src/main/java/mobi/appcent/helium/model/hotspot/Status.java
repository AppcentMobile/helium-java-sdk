package mobi.appcent.helium.model.hotspot;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Status {
    private String timestamp;
    private int height;
    private String online;
    private String[] listenAddrs;
}
