package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class BlockTransactionsResponse {
    private List<BlockTransaction> data;
    private String cursor;

    public BlockTransactionsResponse(List<BlockTransaction> data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }

    public List<BlockTransaction> getData() {
        return data;
    }

    public void setData(List<BlockTransaction> data) {
        this.data = data;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
}
