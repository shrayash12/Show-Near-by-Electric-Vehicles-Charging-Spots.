
package shradha.com.showelectricchargespotsapp.data.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ChargingSpotResponse {

    @SerializedName("DataProvider")
    @Expose
    private DataProvider dataProvider;
    @SerializedName("OperatorInfo")
    @Expose
    private OperatorInfo operatorInfo;
    @SerializedName("UsageType")
    @Expose
    private UsageType usageType;
    @SerializedName("StatusType")
    @Expose
    private StatusType statusType;
    @SerializedName("SubmissionStatus")
    @Expose
    private SubmissionStatus submissionStatus;
    @SerializedName("UserComments")
    @Expose
    private Object userComments;
    @SerializedName("PercentageSimilarity")
    @Expose
    private Object percentageSimilarity;
    @SerializedName("MediaItems")
    @Expose
    private Object mediaItems;
    @SerializedName("IsRecentlyVerified")
    @Expose
    private Boolean isRecentlyVerified;
    @SerializedName("DateLastVerified")
    @Expose
    private Object dateLastVerified;
    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("UUID")
    @Expose
    private String uuid;
    @SerializedName("ParentChargePointID")
    @Expose
    private Object parentChargePointID;
    @SerializedName("DataProviderID")
    @Expose
    private Integer dataProviderID;
    @SerializedName("DataProvidersReference")
    @Expose
    private Object dataProvidersReference;
    @SerializedName("OperatorID")
    @Expose
    private Integer operatorID;
    @SerializedName("OperatorsReference")
    @Expose
    private String operatorsReference;
    @SerializedName("UsageTypeID")
    @Expose
    private Integer usageTypeID;
    @SerializedName("UsageCost")
    @Expose
    private Object usageCost;
    @SerializedName("AddressInfo")
    @Expose
    private AddressInfo addressInfo;
    @SerializedName("Connections")
    @Expose
    private List<Connection> connections = null;
    @SerializedName("NumberOfPoints")
    @Expose
    private Integer numberOfPoints;
    @SerializedName("GeneralComments")
    @Expose
    private String generalComments;
    @SerializedName("DatePlanned")
    @Expose
    private Object datePlanned;
    @SerializedName("DateLastConfirmed")
    @Expose
    private Object dateLastConfirmed;
    @SerializedName("StatusTypeID")
    @Expose
    private Integer statusTypeID;
    @SerializedName("DateLastStatusUpdate")
    @Expose
    private String dateLastStatusUpdate;
    @SerializedName("MetadataValues")
    @Expose
    private Object metadataValues;
    @SerializedName("DataQualityLevel")
    @Expose
    private Integer dataQualityLevel;
    @SerializedName("DateCreated")
    @Expose
    private String dateCreated;
    @SerializedName("SubmissionStatusTypeID")
    @Expose
    private Integer submissionStatusTypeID;

    public DataProvider getDataProvider() {
        return dataProvider;
    }

    public void setDataProvider(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public OperatorInfo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public UsageType getUsageType() {
        return usageType;
    }

    public void setUsageType(UsageType usageType) {
        this.usageType = usageType;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }

    public SubmissionStatus getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(SubmissionStatus submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public Object getUserComments() {
        return userComments;
    }

    public void setUserComments(Object userComments) {
        this.userComments = userComments;
    }

    public Object getPercentageSimilarity() {
        return percentageSimilarity;
    }

    public void setPercentageSimilarity(Object percentageSimilarity) {
        this.percentageSimilarity = percentageSimilarity;
    }

    public Object getMediaItems() {
        return mediaItems;
    }

    public void setMediaItems(Object mediaItems) {
        this.mediaItems = mediaItems;
    }

    public Boolean getIsRecentlyVerified() {
        return isRecentlyVerified;
    }

    public void setIsRecentlyVerified(Boolean isRecentlyVerified) {
        this.isRecentlyVerified = isRecentlyVerified;
    }

    public Object getDateLastVerified() {
        return dateLastVerified;
    }

    public void setDateLastVerified(Object dateLastVerified) {
        this.dateLastVerified = dateLastVerified;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Object getParentChargePointID() {
        return parentChargePointID;
    }

    public void setParentChargePointID(Object parentChargePointID) {
        this.parentChargePointID = parentChargePointID;
    }

    public Integer getDataProviderID() {
        return dataProviderID;
    }

    public void setDataProviderID(Integer dataProviderID) {
        this.dataProviderID = dataProviderID;
    }

    public Object getDataProvidersReference() {
        return dataProvidersReference;
    }

    public void setDataProvidersReference(Object dataProvidersReference) {
        this.dataProvidersReference = dataProvidersReference;
    }

    public Integer getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(Integer operatorID) {
        this.operatorID = operatorID;
    }

    public String getOperatorsReference() {
        return operatorsReference;
    }

    public void setOperatorsReference(String operatorsReference) {
        this.operatorsReference = operatorsReference;
    }

    public Integer getUsageTypeID() {
        return usageTypeID;
    }

    public void setUsageTypeID(Integer usageTypeID) {
        this.usageTypeID = usageTypeID;
    }

    public Object getUsageCost() {
        return usageCost;
    }

    public void setUsageCost(Object usageCost) {
        this.usageCost = usageCost;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public String getGeneralComments() {
        return generalComments;
    }

    public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments;
    }

    public Object getDatePlanned() {
        return datePlanned;
    }

    public void setDatePlanned(Object datePlanned) {
        this.datePlanned = datePlanned;
    }

    public Object getDateLastConfirmed() {
        return dateLastConfirmed;
    }

    public void setDateLastConfirmed(Object dateLastConfirmed) {
        this.dateLastConfirmed = dateLastConfirmed;
    }

    public Integer getStatusTypeID() {
        return statusTypeID;
    }

    public void setStatusTypeID(Integer statusTypeID) {
        this.statusTypeID = statusTypeID;
    }

    public String getDateLastStatusUpdate() {
        return dateLastStatusUpdate;
    }

    public void setDateLastStatusUpdate(String dateLastStatusUpdate) {
        this.dateLastStatusUpdate = dateLastStatusUpdate;
    }

    public Object getMetadataValues() {
        return metadataValues;
    }

    public void setMetadataValues(Object metadataValues) {
        this.metadataValues = metadataValues;
    }

    public Integer getDataQualityLevel() {
        return dataQualityLevel;
    }

    public void setDataQualityLevel(Integer dataQualityLevel) {
        this.dataQualityLevel = dataQualityLevel;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getSubmissionStatusTypeID() {
        return submissionStatusTypeID;
    }

    public void setSubmissionStatusTypeID(Integer submissionStatusTypeID) {
        this.submissionStatusTypeID = submissionStatusTypeID;
    }

}
