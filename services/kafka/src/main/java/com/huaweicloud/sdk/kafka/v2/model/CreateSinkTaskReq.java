package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ObsDestinationDescriptor;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateSinkTaskReq
 */
public class CreateSinkTaskReq  {

    /**
     * 源数据类型，目前只支持BLOB。 
     */
    public static class SourceTypeEnum {

        
        /**
         * Enum BLOB for value: "BLOB"
         */
        public static final SourceTypeEnum BLOB = new SourceTypeEnum("BLOB");
        

        public static final Map<String, SourceTypeEnum> staticFields = new HashMap<String, SourceTypeEnum>() {
            { 
                put("BLOB", BLOB);
            }
        };

        private String value;

        SourceTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SourceTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new SourceTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static SourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SourceTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_type")
    
    private SourceTypeEnum sourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;
    /**
     * 转存的目标类型，当前只支持OBS。 
     */
    public static class DestinationTypeEnum {

        
        /**
         * Enum OBS for value: "OBS"
         */
        public static final DestinationTypeEnum OBS = new DestinationTypeEnum("OBS");
        

        public static final Map<String, DestinationTypeEnum> staticFields = new HashMap<String, DestinationTypeEnum>() {
            { 
                put("OBS", OBS);
            }
        };

        private String value;

        DestinationTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DestinationTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DestinationTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DestinationTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DestinationTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DestinationTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DestinationTypeEnum) {
                return this.value.equals(((DestinationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_type")
    
    private DestinationTypeEnum destinationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_destination_descriptor")
    
    private ObsDestinationDescriptor obsDestinationDescriptor = null;

    public CreateSinkTaskReq withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    


    /**
     * 源数据类型，目前只支持BLOB。 
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public CreateSinkTaskReq withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 转储任务名称。 
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateSinkTaskReq withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    


    /**
     * 转存的目标类型，当前只支持OBS。 
     * @return destinationType
     */
    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public CreateSinkTaskReq withObsDestinationDescriptor(ObsDestinationDescriptor obsDestinationDescriptor) {
        this.obsDestinationDescriptor = obsDestinationDescriptor;
        return this;
    }

    public CreateSinkTaskReq withObsDestinationDescriptor(Consumer<ObsDestinationDescriptor> obsDestinationDescriptorSetter) {
        if(this.obsDestinationDescriptor == null ){
            this.obsDestinationDescriptor = new ObsDestinationDescriptor();
            obsDestinationDescriptorSetter.accept(this.obsDestinationDescriptor);
        }
        
        return this;
    }


    /**
     * Get obsDestinationDescriptor
     * @return obsDestinationDescriptor
     */
    public ObsDestinationDescriptor getObsDestinationDescriptor() {
        return obsDestinationDescriptor;
    }

    public void setObsDestinationDescriptor(ObsDestinationDescriptor obsDestinationDescriptor) {
        this.obsDestinationDescriptor = obsDestinationDescriptor;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSinkTaskReq createSinkTaskReq = (CreateSinkTaskReq) o;
        return Objects.equals(this.sourceType, createSinkTaskReq.sourceType) &&
            Objects.equals(this.taskName, createSinkTaskReq.taskName) &&
            Objects.equals(this.destinationType, createSinkTaskReq.destinationType) &&
            Objects.equals(this.obsDestinationDescriptor, createSinkTaskReq.obsDestinationDescriptor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceType, taskName, destinationType, obsDestinationDescriptor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSinkTaskReq {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    obsDestinationDescriptor: ").append(toIndentedString(obsDestinationDescriptor)).append("\n");
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

