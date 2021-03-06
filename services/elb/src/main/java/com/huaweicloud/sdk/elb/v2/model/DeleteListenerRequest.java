package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteListenerRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cascade")
    
    private Boolean cascade;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener_id")
    
    private String listenerId;

    public DeleteListenerRequest withCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }

    


    /**
     * Get cascade
     * @return cascade
     */
    public Boolean getCascade() {
        return cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }

    public DeleteListenerRequest withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    


    /**
     * Get listenerId
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteListenerRequest deleteListenerRequest = (DeleteListenerRequest) o;
        return Objects.equals(this.cascade, deleteListenerRequest.cascade) &&
            Objects.equals(this.listenerId, deleteListenerRequest.listenerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cascade, listenerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteListenerRequest {\n");
        sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
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

