package JacksonClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Created by rakeshprabhakaran on 16/09/2015.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueDriver {
    Build build;
    OS os;
    JavaDetails java;

    public JavaDetails getJava() {
        return java;
    }

    public void setJava(JavaDetails java) {
        this.java = java;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }


}
