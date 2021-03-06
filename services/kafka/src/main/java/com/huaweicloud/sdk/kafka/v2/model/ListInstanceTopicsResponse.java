package com.huaweicloud.sdk.kafka.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsRespTopics;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListInstanceTopicsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topics")
    
    private List<ListInstanceTopicsRespTopics> topics = null;
    
    public ListInstanceTopicsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * topic总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListInstanceTopicsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 分页查询的大小。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListInstanceTopicsResponse withTopics(List<ListInstanceTopicsRespTopics> topics) {
        this.topics = topics;
        return this;
    }

    
    public ListInstanceTopicsResponse addTopicsItem(ListInstanceTopicsRespTopics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ListInstanceTopicsResponse withTopics(Consumer<List<ListInstanceTopicsRespTopics>> topicsSetter) {
        if(this.topics == null ){
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * Topic列表。
     * @return topics
     */
    public List<ListInstanceTopicsRespTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<ListInstanceTopicsRespTopics> topics) {
        this.topics = topics;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceTopicsResponse listInstanceTopicsResponse = (ListInstanceTopicsResponse) o;
        return Objects.equals(this.count, listInstanceTopicsResponse.count) &&
            Objects.equals(this.size, listInstanceTopicsResponse.size) &&
            Objects.equals(this.topics, listInstanceTopicsResponse.topics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, size, topics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceTopicsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

