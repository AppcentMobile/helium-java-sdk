package mobi.appcent.helium.request;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class SubmitTransactionRequest {
    public String txn;
}
