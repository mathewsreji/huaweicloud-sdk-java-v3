package com.huaweicloud.sdk.elb.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.elb.v2.model.*;

public class ElbClient {
    protected HcClient hcClient;

    public ElbClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbClient> newBuilder() {
        return new ClientBuilder<>(ElbClient::new);
    }


    /**
     * 创建健康检查
     * 给后端云服务器组添加健康检查
     *
     * @param CreateHealthmonitorRequest 请求对象
     * @return CreateHealthmonitorResponse
     */
    public CreateHealthmonitorResponse createHealthmonitor(CreateHealthmonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createHealthmonitor);
    }

    /**
     * 创建转发策略
     * 创建listener关联的转发策略
     *
     * @param CreateL7policyRequest 请求对象
     * @return CreateL7policyResponse
     */
    public CreateL7policyResponse createL7policy(CreateL7policyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7policy);
    }

    /**
     * 创建转发规则
     * 创建转发规则
     *
     * @param CreateL7ruleRequest 请求对象
     * @return CreateL7ruleResponse
     */
    public CreateL7ruleResponse createL7rule(CreateL7ruleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7rule);
    }

    /**
     * 创建监听器
     * 创建与负载均衡器绑定的监听器。
     *
     * @param CreateListenerRequest 请求对象
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建负载均衡器
     * 创建私网类型的增强型负载均衡器。创建成功后，该接口会返回创建的增强型负载均衡器的ID、所属子网ID、负载均衡器IP等详细信息。若要创建公网类型的增强型负载均衡器，还需调用创建浮动IP的接口，将浮动IP与私网负载均衡器的vip_port_id绑定。
     *
     * @param CreateLoadbalancerRequest 请求对象
     * @return CreateLoadbalancerResponse
     */
    public CreateLoadbalancerResponse createLoadbalancer(CreateLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLoadbalancer);
    }

    /**
     * 创建后端云服务器
     * 添加属于某个后端云服务器组的后端云服务器。
     *
     * @param CreateMemberRequest 请求对象
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMember(CreateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端云服务器组
     * 创建后端云服务器组。将多个后端云服务器添加到后端云服务器组中后，请求会在后端云服务器间按后端云服务器组的负载均衡算法和后端云服务器的权重来做请求分发。
     *
     * @param CreatePoolRequest 请求对象
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 创建白名单
     * 创建白名单，控制监听器的访问权限。若开启了白名单功能，只有白名单中放通的IP可以访问该监听器的后端服务。
     *
     * @param CreateWhitelistRequest 请求对象
     * @return CreateWhitelistResponse
     */
    public CreateWhitelistResponse createWhitelist(CreateWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createWhitelist);
    }

    /**
     * 删除健康检查
     * 删除健康检查
     *
     * @param DeleteHealthmonitorRequest 请求对象
     * @return DeleteHealthmonitorResponse
     */
    public DeleteHealthmonitorResponse deleteHealthmonitor(DeleteHealthmonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteHealthmonitor);
    }

    /**
     * 删除转发策略
     * 删除转发策略
     *
     * @param DeleteL7policyRequest 请求对象
     * @return DeleteL7policyResponse
     */
    public DeleteL7policyResponse deleteL7policy(DeleteL7policyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7policy);
    }

    /**
     * 删除转发规则
     * 删除转发规则
     *
     * @param DeleteL7ruleRequest 请求对象
     * @return DeleteL7ruleResponse
     */
    public DeleteL7ruleResponse deleteL7rule(DeleteL7ruleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7rule);
    }

    /**
     * 删除监听器
     * 根据指定ID删除监听器。提供级联删除选项，当选择级联删除时，删除和负载均衡器关联的转发规则、转发策略、白名单、标签等。
     *
     * @param DeleteListenerRequest 请求对象
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除负载均衡
     * 根据指定ID删除负载均衡器。提供级联删除选项，当选择级联删除时，删除和负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则、白名单、标签等
     *
     * @param DeleteLoadbalancerRequest 请求对象
     * @return DeleteLoadbalancerResponse
     */
    public DeleteLoadbalancerResponse deleteLoadbalancer(DeleteLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadbalancer);
    }

    /**
     * 删除后端云服务器
     * 删除后端云服务器
     *
     * @param DeleteMemberRequest 请求对象
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端云服务器组
     * 删除后端云服务器组。
     *
     * @param DeletePoolRequest 请求对象
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePool(DeletePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 删除白名单
     * 删除白名单
     *
     * @param DeleteWhitelistRequest 请求对象
     * @return DeleteWhitelistResponse
     */
    public DeleteWhitelistResponse deleteWhitelist(DeleteWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteWhitelist);
    }

    /**
     * 查询健康检查列表
     * 查询健康检查列表
     *
     * @param ListHealthmonitorsRequest 请求对象
     * @return ListHealthmonitorsResponse
     */
    public ListHealthmonitorsResponse listHealthmonitors(ListHealthmonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listHealthmonitors);
    }

    /**
     * 查询转发策略列表
     * 查询转发策略。支持过滤查询和分页查询。
     *
     * @param ListL7policiesRequest 请求对象
     * @return ListL7policiesResponse
     */
    public ListL7policiesResponse listL7policies(ListL7policiesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7policies);
    }

    /**
     * 查询转发规则列表
     * 查询指定转发策略下关联的转发规则列表
     *
     * @param ListL7rulesRequest 请求对象
     * @return ListL7rulesResponse
     */
    public ListL7rulesResponse listL7rules(ListL7rulesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7rules);
    }

    /**
     * 查询监听器列表
     * 查询监听器列表。支持过滤查询和分页查询。可以通过监听器ID、协议类型、监听端口号、关联的后端云服务器的IP等查询监听器。
     *
     * @param ListListenersRequest 请求对象
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询负载均衡列表
     * 查询负载均衡器列表。
     *
     * @param ListLoadbalancersRequest 请求对象
     * @return ListLoadbalancersResponse
     */
    public ListLoadbalancersResponse listLoadbalancers(ListLoadbalancersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadbalancers);
    }

    /**
     * 查询后端云服务器列表
     * 添加属于某个后端云服务器组的后端云服务器。
     *
     * @param ListMenbersRequest 请求对象
     * @return ListMenbersResponse
     */
    public ListMenbersResponse listMenbers(ListMenbersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listMenbers);
    }

    /**
     * 查询后端云服务器组列表
     * 查询后端云服务器组列表。
     *
     * @param ListPoolsRequest 请求对象
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 查询白名单列表
     * 查询白名单，支持过滤查询和分页查询。
     *
     * @param ListWhitelistsRequest 请求对象
     * @return ListWhitelistsResponse
     */
    public ListWhitelistsResponse listWhitelists(ListWhitelistsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listWhitelists);
    }

    /**
     * 查询健康检查详情
     * 根据指定ID查询健康检查详情。
     *
     * @param ShowHealthmonitorsRequest 请求对象
     * @return ShowHealthmonitorsResponse
     */
    public ShowHealthmonitorsResponse showHealthmonitors(ShowHealthmonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showHealthmonitors);
    }

    /**
     * 查询转发策略详情
     * 根据指定ID查询转发策略详情。
     *
     * @param ShowL7policyRequest 请求对象
     * @return ShowL7policyResponse
     */
    public ShowL7policyResponse showL7policy(ShowL7policyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7policy);
    }

    /**
     * 查询转发规则详情
     * 根据指定ID查询某转发策略下关联的转发规则详情。
     *
     * @param ShowL7ruleRequest 请求对象
     * @return ShowL7ruleResponse
     */
    public ShowL7ruleResponse showL7rule(ShowL7ruleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7rule);
    }

    /**
     * 查询监听器详情
     * 根据指定ID查询监听器详情。
     *
     * @param ShowListenerRequest 请求对象
     * @return ShowListenerResponse
     */
    public ShowListenerResponse showListener(ShowListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询负载均衡详情
     * 根据指定负载均衡器ID查询负载均衡器详情
     *
     * @param ShowLoadbalancerRequest 请求对象
     * @return ShowLoadbalancerResponse
     */
    public ShowLoadbalancerResponse showLoadbalancer(ShowLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadbalancer);
    }

    /**
     * 查询负载均衡状态树
     * 查询负载均衡器状态树。可通过该接口查询负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则的主要信息，了解负载均衡器下资源的拓扑情况。
     *
     * @param ShowLoadbalancersStatusRequest 请求对象
     * @return ShowLoadbalancersStatusResponse
     */
    public ShowLoadbalancersStatusResponse showLoadbalancersStatus(ShowLoadbalancersStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadbalancersStatus);
    }

    /**
     * 查询后端云服务器详情
     * 根据指定ID查询后端云服务器详情。
     *
     * @param ShowMemberRequest 请求对象
     * @return ShowMemberResponse
     */
    public ShowMemberResponse showMember(ShowMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端云服务器组详情
     * 根据指定ID查询后端云服务器组详情。
     *
     * @param ShowPoolRequest 请求对象
     * @return ShowPoolResponse
     */
    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询白名单详情
     * 根据指定ID查询白名单详情。
     *
     * @param ShowWhitelistRequest 请求对象
     * @return ShowWhitelistResponse
     */
    public ShowWhitelistResponse showWhitelist(ShowWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showWhitelist);
    }

    /**
     * 更新健康检查
     * 更新健康检查
     *
     * @param UpdateHealthmonitorRequest 请求对象
     * @return UpdateHealthmonitorResponse
     */
    public UpdateHealthmonitorResponse updateHealthmonitor(UpdateHealthmonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateHealthmonitor);
    }

    /**
     * 更新转发策略
     * 更新转发策略
     *
     * @param UpdateL7policiesRequest 请求对象
     * @return UpdateL7policiesResponse
     */
    public UpdateL7policiesResponse updateL7policies(UpdateL7policiesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7policies);
    }

    /**
     * 更新转发规则
     * 更新指定的转发规则
     *
     * @param UpdateL7ruleRequest 请求对象
     * @return UpdateL7ruleResponse
     */
    public UpdateL7ruleResponse updateL7rule(UpdateL7ruleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7rule);
    }

    /**
     * 更新监听器
     * 更新监听器。
     *
     * @param UpdateListenerRequest 请求对象
     * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateListener);
    }

    /**
     * 更新负载均衡器
     * 更新负载均衡器。
     *
     * @param UpdateLoadbalancerRequest 请求对象
     * @return UpdateLoadbalancerResponse
     */
    public UpdateLoadbalancerResponse updateLoadbalancer(UpdateLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLoadbalancer);
    }

    /**
     * 更新后端云服务器
     * 更新后端云服务器
     *
     * @param UpdateMemberRequest 请求对象
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(UpdateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端云服务器组
     * 更新后端云服务器组。
     *
     * @param UpdatePoolRequest 请求对象
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 更新白名单
     * 更新白名单。可以打开或关闭白名单，或更新访问控制的IP。
     *
     * @param UpdateWhitelistRequest 请求对象
     * @return UpdateWhitelistResponse
     */
    public UpdateWhitelistResponse updateWhitelist(UpdateWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateWhitelist);
    }

    /**
     * 创建SSL证书
     * 创建SSL证书。将监听器和SSL证书绑定后，可以通过负载均衡器实现服务端认证，后端服务器只要提供HTTP服务就能实现安全可靠的连接。
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 删除SSL证书
     * 删除指定的SSL证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 查询SSL证书列表
     * 查询SSL证书。支持过滤查询和分页查询。
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询SSL证书详情
     * 查询指定SSL证书的详情信息。
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 更新SSL证书
     * 更新指定的SSL证书
     *
     * @param UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateCertificate);
    }

}