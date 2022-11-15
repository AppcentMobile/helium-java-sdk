package mobi.appcent.helium.model.hotspot;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class Election {
    private int delay;
    private String hash;
    private int height;
    private String[] members;
    private String proof;
    private String time;
    private String type;
}
