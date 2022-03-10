
package shradha.com.showelectricchargespotsapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AddressInfo {

    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("AddressLine1")
    @Expose
    private String addressLine1;
    @SerializedName("AddressLine2")
    @Expose
    private Object addressLine2;
    @SerializedName("Town")
    @Expose
    private String town;
    @SerializedName("StateOrProvince")
    @Expose
    private Object stateOrProvince;
    @SerializedName("Postcode")
    @Expose
    private Object postcode;
    @SerializedName("CountryID")
    @Expose
    private Integer countryID;
    @SerializedName("Country")
    @Expose
    private Country country;
    @SerializedName("Latitude")
    @Expose
    private Double latitude;
    @SerializedName("Longitude")
    @Expose
    private Double longitude;
    @SerializedName("ContactTelephone1")
    @Expose
    private String contactTelephone1;
    @SerializedName("ContactTelephone2")
    @Expose
    private Object contactTelephone2;
    @SerializedName("ContactEmail")
    @Expose
    private Object contactEmail;
    @SerializedName("AccessComments")
    @Expose
    private Object accessComments;
    @SerializedName("RelatedURL")
    @Expose
    private Object relatedURL;
    @SerializedName("Distance")
    @Expose
    private Double distance;
    @SerializedName("DistanceUnit")
    @Expose
    private Integer distanceUnit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Object getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(Object addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Object getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(Object stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public Object getPostcode() {
        return postcode;
    }

    public void setPostcode(Object postcode) {
        this.postcode = postcode;
    }

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getContactTelephone1() {
        return contactTelephone1;
    }

    public void setContactTelephone1(String contactTelephone1) {
        this.contactTelephone1 = contactTelephone1;
    }

    public Object getContactTelephone2() {
        return contactTelephone2;
    }

    public void setContactTelephone2(Object contactTelephone2) {
        this.contactTelephone2 = contactTelephone2;
    }

    public Object getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(Object contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Object getAccessComments() {
        return accessComments;
    }

    public void setAccessComments(Object accessComments) {
        this.accessComments = accessComments;
    }

    public Object getRelatedURL() {
        return relatedURL;
    }

    public void setRelatedURL(Object relatedURL) {
        this.relatedURL = relatedURL;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(Integer distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

}
