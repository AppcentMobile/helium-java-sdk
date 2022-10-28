package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class TokenSupplyResponse {
    private TokenSupply data;

    public TokenSupplyResponse(TokenSupply data) {
        this.data = data;
    }

    public TokenSupply getData() {
        return data;
    }

    public void setData(TokenSupply data) {
        this.data = data;
    }
}
