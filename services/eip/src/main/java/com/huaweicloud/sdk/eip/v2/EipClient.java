package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.eip.v2.model.*;

public class EipClient {
    protected HcClient hcClient;

    public EipClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipClient> newBuilder() {
        return new ClientBuilder<>(EipClient::new);
    }


    /**
     * 共享带宽插入弹性公网IP
     * 共享带宽插入弹性公网IP。
     *
     * @param AddPublicipsIntoSharedBandwidthRequest 请求对象
     * @return AddPublicipsIntoSharedBandwidthResponse
     */
    public AddPublicipsIntoSharedBandwidthResponse addPublicipsIntoSharedBandwidth(AddPublicipsIntoSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.addPublicipsIntoSharedBandwidth);
    }

    /**
     * 批量创建共享带宽
     * 批量创建共享带宽。
     *
     * @param BatchCreateSharedBandwidthsRequest 请求对象
     * @return BatchCreateSharedBandwidthsResponse
     */
    public BatchCreateSharedBandwidthsResponse batchCreateSharedBandwidths(BatchCreateSharedBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchCreateSharedBandwidths);
    }

    /**
     * 创建共享带宽
     * 创建共享带宽。
     *
     * @param CreateSharedBandwidthRequest 请求对象
     * @return CreateSharedBandwidthResponse
     */
    public CreateSharedBandwidthResponse createSharedBandwidth(CreateSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createSharedBandwidth);
    }

    /**
     * 删除共享带宽
     * 删除共享带宽。
     *
     * @param DeleteSharedBandwidthRequest 请求对象
     * @return DeleteSharedBandwidthResponse
     */
    public DeleteSharedBandwidthResponse deleteSharedBandwidth(DeleteSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deleteSharedBandwidth);
    }

    /**
     * 查询带宽列表
     * 查询带宽列表。
     *
     * @param ListBandwidthsRequest 请求对象
     * @return ListBandwidthsResponse
     */
    public ListBandwidthsResponse listBandwidths(ListBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listBandwidths);
    }

    /**
     * 查询配额接口
     * 查询配额
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listQuotas);
    }

    /**
     * 共享带宽移除弹性公网IP
     * 共享带宽移除弹性公网IP。
     *
     * @param RemovePublicipsFromSharedBandwidthRequest 请求对象
     * @return RemovePublicipsFromSharedBandwidthResponse
     */
    public RemovePublicipsFromSharedBandwidthResponse removePublicipsFromSharedBandwidth(RemovePublicipsFromSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.removePublicipsFromSharedBandwidth);
    }

    /**
     * 查询带宽
     * 查询带宽
     *
     * @param ShowBandwidthRequest 请求对象
     * @return ShowBandwidthResponse
     */
    public ShowBandwidthResponse showBandwidth(ShowBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showBandwidth);
    }

    /**
     * 更新带宽
     * 更新带宽。
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return UpdateBandwidthResponse
     */
    public UpdateBandwidthResponse updateBandwidth(UpdateBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updateBandwidth);
    }

    /**
     * 更新包周期带宽
     * 更新带宽。
     *
     * @param UpdatePrePaidBandwidthRequest 请求对象
     * @return UpdatePrePaidBandwidthResponse
     */
    public UpdatePrePaidBandwidthResponse updatePrePaidBandwidth(UpdatePrePaidBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updatePrePaidBandwidth);
    }

    /**
     * 批量创建弹性公网IP资源标签
     * 为指定的弹性公网IP资源实例批量添加标签。
     *
     * @param BatchCreatePublicipTagsRequest 请求对象
     * @return BatchCreatePublicipTagsResponse
     */
    public BatchCreatePublicipTagsResponse batchCreatePublicipTags(BatchCreatePublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchCreatePublicipTags);
    }

    /**
     * 批量删除弹性公网IP资源标签
     * 为指定的弹性公网IP资源实例批量删除标签。
     *
     * @param BatchDeletePublicipTagsRequest 请求对象
     * @return BatchDeletePublicipTagsResponse
     */
    public BatchDeletePublicipTagsResponse batchDeletePublicipTags(BatchDeletePublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchDeletePublicipTags);
    }

    /**
     * 申请包周期弹性公网IP
     * 申请包年包月的弹性公网IP。
     *
     * @param CreatePrePaidPublicipRequest 请求对象
     * @return CreatePrePaidPublicipResponse
     */
    public CreatePrePaidPublicipResponse createPrePaidPublicip(CreatePrePaidPublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPrePaidPublicip);
    }

    /**
     * 申请弹性公网IP
     * 申请弹性公网IP，支持IPv4和IPv6。  弹性公网IP（Elastic IP）提供独立的公网IP资源，包括公网IP地址与公网出口带宽服务。可以与弹性云服务器、裸金属服务器、虚拟IP、弹性负载均衡、NAT网关等资源灵活地绑定及解绑。拥有多种灵活的计费方式，可以满足各种业务场景的需要。
     *
     * @param CreatePublicipRequest 请求对象
     * @return CreatePublicipResponse
     */
    public CreatePublicipResponse createPublicip(CreatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPublicip);
    }

    /**
     * 创建弹性公网IP资源标签
     * 给指定弹性IP资源实例增加标签信息。
     *
     * @param CreatePublicipTagRequest 请求对象
     * @return CreatePublicipTagResponse
     */
    public CreatePublicipTagResponse createPublicipTag(CreatePublicipTagRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPublicipTag);
    }

    /**
     * 删除弹性公网IP
     * 删除弹性公网IP,绑定状态eip不允许直接删除。
     *
     * @param DeletePublicipRequest 请求对象
     * @return DeletePublicipResponse
     */
    public DeletePublicipResponse deletePublicip(DeletePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deletePublicip);
    }

    /**
     * 删除弹性公网IP的标签
     * 删除指定弹性公网IP的标签信息。其中project_id是项目ID，publicip_id 是要操作的弹性公网IP的id。key是要删除标签的键。
     *
     * @param DeletePublicipTagRequest 请求对象
     * @return DeletePublicipTagResponse
     */
    public DeletePublicipTagResponse deletePublicipTag(DeletePublicipTagRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deletePublicipTag);
    }

    /**
     * 查询租户的弹性公网IP标签
     * 查询租户在指定区域和实例类型的所有标签集合。
     *
     * @param ListPublicipTagsRequest 请求对象
     * @return ListPublicipTagsResponse
     */
    public ListPublicipTagsResponse listPublicipTags(ListPublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicipTags);
    }

    /**
     * 查询弹性公网IP列表
     * 查询弹性公网IP列表
     *
     * @param ListPublicipsRequest 请求对象
     * @return ListPublicipsResponse
     */
    public ListPublicipsResponse listPublicips(ListPublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicips);
    }

    /**
     * 按标签查询弹性公网IP列表
     * 使用标签过滤弹性公网IP。
     *
     * @param ListPublicipsByTagsRequest 请求对象
     * @return ListPublicipsByTagsResponse
     */
    public ListPublicipsByTagsResponse listPublicipsByTags(ListPublicipsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicipsByTags);
    }

    /**
     * 查询弹性公网IP
     * 查询指定的弹性公网IP。
     *
     * @param ShowPublicipRequest 请求对象
     * @return ShowPublicipResponse
     */
    public ShowPublicipResponse showPublicip(ShowPublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicip);
    }

    /**
     * 查询弹性公网IP的标签
     * 查询指定弹性IP实例的标签信息。
     *
     * @param ShowPublicipTagsRequest 请求对象
     * @return ShowPublicipTagsResponse
     */
    public ShowPublicipTagsResponse showPublicipTags(ShowPublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicipTags);
    }

    /**
     * 更新弹性公网IP
     * 更新弹性公网IP，将弹性公网IP跟一个网卡绑定或者解绑定，转换IP地址版本类型。
     *
     * @param UpdatePublicipRequest 请求对象
     * @return UpdatePublicipResponse
     */
    public UpdatePublicipResponse updatePublicip(UpdatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updatePublicip);
    }

    /**
     * 创建浮动IP
     * 创建浮动IP的外部网络UUID，请使用GET /v2.0/networks?router:external&#x3D;True或neutron net-external-list方式获取。
     *
     * @param NeutronCreateFloatingIpRequest 请求对象
     * @return NeutronCreateFloatingIpResponse
     */
    public NeutronCreateFloatingIpResponse neutronCreateFloatingIp(NeutronCreateFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronCreateFloatingIp);
    }

    /**
     * 删除浮动IP
     * 删除指定的浮动IP。
     *
     * @param NeutronDeleteFloatingIpRequest 请求对象
     * @return NeutronDeleteFloatingIpResponse
     */
    public NeutronDeleteFloatingIpResponse neutronDeleteFloatingIp(NeutronDeleteFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronDeleteFloatingIp);
    }

    /**
     * 查询浮动IP列表
     * 查询提交请求的租户有权限操作的所有浮动IP地址。
     *
     * @param NeutronListFloatingIpsRequest 请求对象
     * @return NeutronListFloatingIpsResponse
     */
    public NeutronListFloatingIpsResponse neutronListFloatingIps(NeutronListFloatingIpsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronListFloatingIps);
    }

    /**
     * 查询浮动IP
     * 查询浮动IP详情，包括浮动IP状态，浮动IP所属路由器ID，浮动IP的外部网络ID等等。
     *
     * @param NeutronShowFloatingIpRequest 请求对象
     * @return NeutronShowFloatingIpResponse
     */
    public NeutronShowFloatingIpResponse neutronShowFloatingIp(NeutronShowFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronShowFloatingIp);
    }

    /**
     * 更新浮动IP
     * 更新浮动IP。  更新时需在URL中给出浮动IP地址的ID。  port_id 为空，则表示浮动IP从端口解绑。
     *
     * @param NeutronUpdateFloatingIpRequest 请求对象
     * @return NeutronUpdateFloatingIpResponse
     */
    public NeutronUpdateFloatingIpResponse neutronUpdateFloatingIp(NeutronUpdateFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronUpdateFloatingIp);
    }

}