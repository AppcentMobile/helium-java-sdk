package mobi.appcent.helium.response.block;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.block.BlockDescription;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class BlockDescriptionResponse {
    public BlockDescription data;
}
