package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class RoleCount {
    @SerializedName("assert_location_v1")
    private String assertLocationV1;

    public RoleCount(String assertLocationV1) {
        this.assertLocationV1 = assertLocationV1;
    }

    public String getAssertLocationV1() {
        return assertLocationV1;
    }

    public void setAssertLocationV1(String assertLocationV1) {
        this.assertLocationV1 = assertLocationV1;
    }
}
