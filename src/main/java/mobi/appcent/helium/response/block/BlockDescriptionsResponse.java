package mobi.appcent.helium.response.block;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.block.BlockDescription;

import java.util.List;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class BlockDescriptionsResponse {
    public List<BlockDescription> data;
    public String cursor;
}
