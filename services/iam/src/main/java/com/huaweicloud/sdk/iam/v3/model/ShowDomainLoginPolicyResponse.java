package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LoginPolicyResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainLoginPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="login_policy")
    
    private LoginPolicyResult loginPolicy = null;

    public ShowDomainLoginPolicyResponse withLoginPolicy(LoginPolicyResult loginPolicy) {
        this.loginPolicy = loginPolicy;
        return this;
    }

    public ShowDomainLoginPolicyResponse withLoginPolicy(Consumer<LoginPolicyResult> loginPolicySetter) {
        if(this.loginPolicy == null ){
            this.loginPolicy = new LoginPolicyResult();
            loginPolicySetter.accept(this.loginPolicy);
        }
        
        return this;
    }


    /**
     * Get loginPolicy
     * @return loginPolicy
     */
    public LoginPolicyResult getLoginPolicy() {
        return loginPolicy;
    }

    public void setLoginPolicy(LoginPolicyResult loginPolicy) {
        this.loginPolicy = loginPolicy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainLoginPolicyResponse showDomainLoginPolicyResponse = (ShowDomainLoginPolicyResponse) o;
        return Objects.equals(this.loginPolicy, showDomainLoginPolicyResponse.loginPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loginPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainLoginPolicyResponse {\n");
        sb.append("    loginPolicy: ").append(toIndentedString(loginPolicy)).append("\n");
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
