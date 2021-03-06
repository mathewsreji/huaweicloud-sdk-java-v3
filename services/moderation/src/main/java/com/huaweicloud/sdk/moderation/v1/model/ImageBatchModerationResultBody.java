package com.huaweicloud.sdk.moderation.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.ImageDetectionResultDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ImageBatchModerationResultBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggestion")
    
    private String suggestion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private ImageDetectionResultDetail detail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category_suggestion")
    
    private Object categorySuggestion = null;

    public ImageBatchModerationResultBody withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 图片的URL路径。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageBatchModerationResultBody withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    


    /**
     * 请参见[表2](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table663805019540)中suggestion字段说明。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public ImageBatchModerationResultBody withDetail(ImageDetectionResultDetail detail) {
        this.detail = detail;
        return this;
    }

    public ImageBatchModerationResultBody withDetail(Consumer<ImageDetectionResultDetail> detailSetter) {
        if(this.detail == null ){
            this.detail = new ImageDetectionResultDetail();
            detailSetter.accept(this.detail);
        }
        
        return this;
    }


    /**
     * Get detail
     * @return detail
     */
    public ImageDetectionResultDetail getDetail() {
        return detail;
    }

    public void setDetail(ImageDetectionResultDetail detail) {
        this.detail = detail;
    }

    public ImageBatchModerationResultBody withCategorySuggestion(Object categorySuggestion) {
        this.categorySuggestion = categorySuggestion;
        return this;
    }

    


    /**
     * 具体每个场景的检测结果。  block：包含敏感信息，不通过  pass：不包含敏感信息，通过  review：需要人工复检 
     * @return categorySuggestion
     */
    public Object getCategorySuggestion() {
        return categorySuggestion;
    }

    public void setCategorySuggestion(Object categorySuggestion) {
        this.categorySuggestion = categorySuggestion;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageBatchModerationResultBody imageBatchModerationResultBody = (ImageBatchModerationResultBody) o;
        return Objects.equals(this.url, imageBatchModerationResultBody.url) &&
            Objects.equals(this.suggestion, imageBatchModerationResultBody.suggestion) &&
            Objects.equals(this.detail, imageBatchModerationResultBody.detail) &&
            Objects.equals(this.categorySuggestion, imageBatchModerationResultBody.categorySuggestion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, suggestion, detail, categorySuggestion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBatchModerationResultBody {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    categorySuggestion: ").append(toIndentedString(categorySuggestion)).append("\n");
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

