package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * IssueRecordV4Details
 */
public class IssueRecordV4Details  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="property")
    
    private String property;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="old_value")
    
    private String oldValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_value")
    
    private String newValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation")
    
    private String operation;

    public IssueRecordV4Details withProperty(String property) {
        this.property = property;
        return this;
    }

    


    /**
     * 操作属性
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public IssueRecordV4Details withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    


    /**
     * 上次的记录
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public IssueRecordV4Details withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    


    /**
     * 当前值
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public IssueRecordV4Details withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    


    /**
     * 操作
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueRecordV4Details issueRecordV4Details = (IssueRecordV4Details) o;
        return Objects.equals(this.property, issueRecordV4Details.property) &&
            Objects.equals(this.oldValue, issueRecordV4Details.oldValue) &&
            Objects.equals(this.newValue, issueRecordV4Details.newValue) &&
            Objects.equals(this.operation, issueRecordV4Details.operation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(property, oldValue, newValue, operation);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueRecordV4Details {\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

