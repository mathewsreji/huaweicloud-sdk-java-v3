package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 增强版实例的存储池空间信息。
 */
public class ListInstancesStorageResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private String used;

    public ListInstancesStorageResult withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小。单位：GB。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ListInstancesStorageResult withUsed(String used) {
        this.used = used;
        return this;
    }

    


    /**
     * 磁盘使用量。单位：GB。
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesStorageResult listInstancesStorageResult = (ListInstancesStorageResult) o;
        return Objects.equals(this.size, listInstancesStorageResult.size) &&
            Objects.equals(this.used, listInstancesStorageResult.used);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, used);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesStorageResult {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

