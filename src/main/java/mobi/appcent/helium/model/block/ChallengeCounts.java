package mobi.appcent.helium.model.block;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class ChallengeCounts {
    public Integer active;
    public Integer last_day;
}
