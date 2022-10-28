package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class HeightResponse {
    private Height data;

    public HeightResponse(Height data) {
        this.data = data;
    }

    public Height getData() {
        return data;
    }

    public void setData(Height data) {
        this.data = data;
    }
}

