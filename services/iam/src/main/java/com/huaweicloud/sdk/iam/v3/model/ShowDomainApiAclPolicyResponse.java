package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AclPolicyResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainApiAclPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_acl_policy")
    
    private AclPolicyResult apiAclPolicy = null;

    public ShowDomainApiAclPolicyResponse withApiAclPolicy(AclPolicyResult apiAclPolicy) {
        this.apiAclPolicy = apiAclPolicy;
        return this;
    }

    public ShowDomainApiAclPolicyResponse withApiAclPolicy(Consumer<AclPolicyResult> apiAclPolicySetter) {
        if(this.apiAclPolicy == null ){
            this.apiAclPolicy = new AclPolicyResult();
            apiAclPolicySetter.accept(this.apiAclPolicy);
        }
        
        return this;
    }


    /**
     * Get apiAclPolicy
     * @return apiAclPolicy
     */
    public AclPolicyResult getApiAclPolicy() {
        return apiAclPolicy;
    }

    public void setApiAclPolicy(AclPolicyResult apiAclPolicy) {
        this.apiAclPolicy = apiAclPolicy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainApiAclPolicyResponse showDomainApiAclPolicyResponse = (ShowDomainApiAclPolicyResponse) o;
        return Objects.equals(this.apiAclPolicy, showDomainApiAclPolicyResponse.apiAclPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiAclPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainApiAclPolicyResponse {\n");
        sb.append("    apiAclPolicy: ").append(toIndentedString(apiAclPolicy)).append("\n");
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
