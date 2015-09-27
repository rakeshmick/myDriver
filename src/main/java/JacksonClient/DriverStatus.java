package JacksonClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by rakeshprabhakaran on 16/09/2015.
 */
//@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverStatus {

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer gethCode() {
        return hCode;
    }

    public void sethCode(Integer hCode) {
        this.hCode = hCode;
    }

    public JacksonClient.ValueDriver getValue() {
        return value;
    }

    public void setValue(ValueDriver value) {
        this.value = value;
    }


    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    String state;
    String    sessionId;//": null,
    Integer hCode;//": 1260004231,
    ValueDriver value;//     "value": {
   // Build build;
   // OS os;
   // JavaDetails java;
    @JsonProperty("class")
    String classname;//"class": "org.openqa.selenium.remote.Response",
    Integer status;//"status": 0

}
