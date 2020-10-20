package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.HealthmonitorV2Resp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateHealthmonitorResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor")
    
    private HealthmonitorV2Resp healthmonitor = null;

    public CreateHealthmonitorResponse withHealthmonitor(HealthmonitorV2Resp healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public CreateHealthmonitorResponse withHealthmonitor(Consumer<HealthmonitorV2Resp> healthmonitorSetter) {
        if(this.healthmonitor == null ){
            this.healthmonitor = new HealthmonitorV2Resp();
            healthmonitorSetter.accept(this.healthmonitor);
        }
        
        return this;
    }


    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public HealthmonitorV2Resp getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(HealthmonitorV2Resp healthmonitor) {
        this.healthmonitor = healthmonitor;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHealthmonitorResponse createHealthmonitorResponse = (CreateHealthmonitorResponse) o;
        return Objects.equals(this.healthmonitor, createHealthmonitorResponse.healthmonitor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(healthmonitor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHealthmonitorResponse {\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}
