package JacksonClient;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by rakeshprabhakaran on 16/09/2015.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JavaDetails {
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    String version;
}
