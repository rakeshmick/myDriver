package JacksonClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteAgain {

    private String type;
    private ValueAgain value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ValueAgain getValue() {
        return value;
    }

    public void setValue(ValueAgain value) {
        this.value = value;
    }




}
