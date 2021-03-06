package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.MemberResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMenbersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="members")
    
    private List<MemberResp> members = null;
    
    public ListMenbersResponse withMembers(List<MemberResp> members) {
        this.members = members;
        return this;
    }

    
    public ListMenbersResponse addMembersItem(MemberResp membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public ListMenbersResponse withMembers(Consumer<List<MemberResp>> membersSetter) {
        if(this.members == null ){
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 后端云服务器对象的列表
     * @return members
     */
    public List<MemberResp> getMembers() {
        return members;
    }

    public void setMembers(List<MemberResp> members) {
        this.members = members;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMenbersResponse listMenbersResponse = (ListMenbersResponse) o;
        return Objects.equals(this.members, listMenbersResponse.members);
    }
    @Override
    public int hashCode() {
        return Objects.hash(members);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMenbersResponse {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

