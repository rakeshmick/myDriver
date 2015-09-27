package JacksonClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by rakeshprabhakaran on 16/09/2015.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OS {
    String name;//: "Mac OS X",
    String arch;//": "x86_64",
    String version;//": "10.10.5"

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }


}
