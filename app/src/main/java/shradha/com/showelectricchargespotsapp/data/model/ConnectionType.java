
package shradha.com.showelectricchargespotsapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConnectionType {

    @SerializedName("FormalName")
    @Expose
    private Object formalName;
    @SerializedName("IsDiscontinued")
    @Expose
    private Boolean isDiscontinued;
    @SerializedName("IsObsolete")
    @Expose
    private Boolean isObsolete;
    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("Title")
    @Expose
    private String title;

    public Object getFormalName() {
        return formalName;
    }

    public void setFormalName(Object formalName) {
        this.formalName = formalName;
    }

    public Boolean getIsDiscontinued() {
        return isDiscontinued;
    }

    public void setIsDiscontinued(Boolean isDiscontinued) {
        this.isDiscontinued = isDiscontinued;
    }

    public Boolean getIsObsolete() {
        return isObsolete;
    }

    public void setIsObsolete(Boolean isObsolete) {
        this.isObsolete = isObsolete;
    }

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

}
