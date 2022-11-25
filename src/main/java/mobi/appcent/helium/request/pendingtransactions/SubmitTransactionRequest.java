package mobi.appcent.helium.request.pendingtransactions;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class SubmitTransactionRequest {
    private String txn;
}
