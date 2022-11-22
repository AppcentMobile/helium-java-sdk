package mobi.appcent.helium.response.block;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.block.BlockTransaction;

import java.util.List;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class BlockTransactionsResponse {
    public List<BlockTransaction> data;
    public String cursor;
}
