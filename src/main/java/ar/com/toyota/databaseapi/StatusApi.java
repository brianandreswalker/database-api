package ar.com.toyota.databaseapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

@JsonRootName(value = "status")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StatusApi {

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    public StatusApi() {
        super();
    }

    public StatusApi(String message) {
        super();
        this.message = message;
    }

    public StatusApi(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object obj)
    {
        return reflectionEquals(this, obj);
    }

    @Override
    public String toString()
    {
        return reflectionToString(this);
    }
}
