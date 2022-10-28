package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class BlockDescriptionsResponse {
    private List<BlockDescription> data;
    private String cursor;

    public BlockDescriptionsResponse(List<BlockDescription> data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }

    public List<BlockDescription> getData() {
        return data;
    }

    public void setData(List<BlockDescription> data) {
        this.data = data;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
}
