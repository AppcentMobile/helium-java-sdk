package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class Path {
    private List<Witness> witnesses;
    private Receipt receipt;
    private Geocode geocode;
    @SerializedName("challengee_owner")
    private String challangeeOwner;
    @SerializedName("challengee_lon")
    private float challangeeLon;
    @SerializedName("challengee_location")
    private String challangeeLocation;
    @SerializedName("challengee_lat")
    private float challangeeLat;
    private String challangee;

    public Path(List<Witness> witnesses, Receipt receipt, Geocode geocode, String challangeeOwner, float challangeeLon, String challangeeLocation, float challangeeLat, String challangee) {
        this.witnesses = witnesses;
        this.receipt = receipt;
        this.geocode = geocode;
        this.challangeeOwner = challangeeOwner;
        this.challangeeLon = challangeeLon;
        this.challangeeLocation = challangeeLocation;
        this.challangeeLat = challangeeLat;
        this.challangee = challangee;
    }

    public List<Witness> getWitnesses() {
        return witnesses;
    }

    public void setWitnesses(List<Witness> witnesses) {
        this.witnesses = witnesses;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Geocode getGeocode() {
        return geocode;
    }

    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

    public String getChallangeeOwner() {
        return challangeeOwner;
    }

    public void setChallangeeOwner(String challangeeOwner) {
        this.challangeeOwner = challangeeOwner;
    }

    public float getChallangeeLon() {
        return challangeeLon;
    }

    public void setChallangeeLon(float challangeeLon) {
        this.challangeeLon = challangeeLon;
    }

    public String getChallangeeLocation() {
        return challangeeLocation;
    }

    public void setChallangeeLocation(String challangeeLocation) {
        this.challangeeLocation = challangeeLocation;
    }

    public float getChallangeeLat() {
        return challangeeLat;
    }

    public void setChallangeeLat(float challangeeLat) {
        this.challangeeLat = challangeeLat;
    }

    public String getChallangee() {
        return challangee;
    }

    public void setChallangee(String challangee) {
        this.challangee = challangee;
    }
}
