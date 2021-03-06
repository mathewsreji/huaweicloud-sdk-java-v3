package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UserPassword
 */
public class UserPassword  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="username")
    
    private String username = "root";

    public UserPassword withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 登录密码，取值请参见[创建云服务器](https://support.huaweicloud.com/api-ecs/zh-cn_topic_0020212668.html)中**adminPass**参数的描述。若创建节点通过用户名密码方式，即使用该字段，则响应体中该字段作屏蔽展示。创建节点时password字段需要加盐加密，具体方法请参见[创建节点时password字段加盐加密](https://support.huaweicloud.com/bestpractice-cce/cce_bestpractice_0058.html)。 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserPassword withUsername(String username) {
        this.username = username;
        return this;
    }

    


    /**
     * 登录帐号，默认为“root”
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserPassword userPassword = (UserPassword) o;
        return Objects.equals(this.password, userPassword.password) &&
            Objects.equals(this.username, userPassword.username);
    }
    @Override
    public int hashCode() {
        return Objects.hash(password, username);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPassword {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

