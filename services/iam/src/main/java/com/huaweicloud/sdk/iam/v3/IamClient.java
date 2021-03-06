package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.iam.v3.model.*;

public class IamClient {
    protected HcClient hcClient;

    public IamClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamClient> newBuilder() {
        return new ClientBuilder<>(IamClient::new, "GlobalCredentials,BasicCredentials");
    }


    /**
     * 为委托授予所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithAllProjectsPermissionRequest 请求对象
     * @return AssociateAgencyWithAllProjectsPermissionResponse
     */
    public AssociateAgencyWithAllProjectsPermissionResponse associateAgencyWithAllProjectsPermission(AssociateAgencyWithAllProjectsPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithAllProjectsPermission);
    }

    /**
     * 为委托授予全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithDomainPermissionRequest 请求对象
     * @return AssociateAgencyWithDomainPermissionResponse
     */
    public AssociateAgencyWithDomainPermissionResponse associateAgencyWithDomainPermission(AssociateAgencyWithDomainPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithDomainPermission);
    }

    /**
     * 为委托授予项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithProjectPermissionRequest 请求对象
     * @return AssociateAgencyWithProjectPermissionResponse
     */
    public AssociateAgencyWithProjectPermissionResponse associateAgencyWithProjectPermission(AssociateAgencyWithProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithProjectPermission);
    }

    /**
     * 检查委托下是否具有所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)检查委托是否具有所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckAllProjectsPermissionForAgencyRequest 请求对象
     * @return CheckAllProjectsPermissionForAgencyResponse
     */
    public CheckAllProjectsPermissionForAgencyResponse checkAllProjectsPermissionForAgency(CheckAllProjectsPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkAllProjectsPermissionForAgency);
    }

    /**
     * 查询委托是否拥有全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckDomainPermissionForAgencyRequest 请求对象
     * @return CheckDomainPermissionForAgencyResponse
     */
    public CheckDomainPermissionForAgencyResponse checkDomainPermissionForAgency(CheckDomainPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkDomainPermissionForAgency);
    }

    /**
     * 查询委托是否拥有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckProjectPermissionForAgencyRequest 请求对象
     * @return CheckProjectPermissionForAgencyResponse
     */
    public CheckProjectPermissionForAgencyResponse checkProjectPermissionForAgency(CheckProjectPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkProjectPermissionForAgency);
    }

    /**
     * 创建委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyRequest 请求对象
     * @return CreateAgencyResponse
     */
    public CreateAgencyResponse createAgency(CreateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgency);
    }

    /**
     * 创建委托自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyCustomPolicyRequest 请求对象
     * @return CreateAgencyCustomPolicyResponse
     */
    public CreateAgencyCustomPolicyResponse createAgencyCustomPolicy(CreateAgencyCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgencyCustomPolicy);
    }

    /**
     * 创建云服务自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建云服务自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateCloudServiceCustomPolicyRequest 请求对象
     * @return CreateCloudServiceCustomPolicyResponse
     */
    public CreateCloudServiceCustomPolicyResponse createCloudServiceCustomPolicy(CreateCloudServiceCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createCloudServiceCustomPolicy);
    }

    /**
     * 获取自定义代理登录票据
     * 该接口用于用于获取自定义代理登录票据logintoken。logintoken是系统颁发给自定义代理用户的登录票据，承载用户的身份、session等信息。调用自定义代理URL登录云服务控制台时，可以使用本接口获取的logintoken进行认证。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。    &gt; - logintoken的有效期为10分钟。
     *
     * @param CreateLoginTokenRequest 请求对象
     * @return CreateLoginTokenResponse
     */
    public CreateLoginTokenResponse createLoginToken(CreateLoginTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createLoginToken);
    }

    /**
     * 导入Metadata文件
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)导入Metadata文件。    账号在使用联邦认证功能前，需要先将Metadata文件导入到IAM中。Metadata文件是SAML 2.0协议约定的接口文件，包含访问接口地址和证书信息，请找企业管理员获取企业IdP的Metadata文件。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMetadataRequest 请求对象
     * @return CreateMetadataResponse
     */
    public CreateMetadataResponse createMetadata(CreateMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createMetadata);
    }

    /**
     * 获取联邦认证unscoped token(IdP initiated)
     * 该接口可以用于通过IdP initiated的联邦认证方式获取unscoped token。    Unscoped token不能用来鉴权，若联邦用户需要使用token进行鉴权，请参考[获取联邦认证scoped token](https://support.huaweicloud.com/api-iam/iam_13_0604.html)获取scoped token。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。     &gt; - 该接口支持在命令行侧调用，需要客户端使用IdP initiated的联邦认证方式获取SAMLResponse，并采用浏览器提交表单数据的方式，获取unscoped token。
     *
     * @param CreateUnscopeTokenByIdpInitiatedRequest 请求对象
     * @return CreateUnscopeTokenByIdpInitiatedResponse
     */
    public CreateUnscopeTokenByIdpInitiatedResponse createUnscopeTokenByIdpInitiated(CreateUnscopeTokenByIdpInitiatedRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createUnscopeTokenByIdpInitiated);
    }

    /**
     * 删除委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteAgencyRequest 请求对象
     * @return DeleteAgencyResponse
     */
    public DeleteAgencyResponse deleteAgency(DeleteAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteAgency);
    }

    /**
     * 删除自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteCustomPolicyRequest 请求对象
     * @return DeleteCustomPolicyResponse
     */
    public DeleteCustomPolicyResponse deleteCustomPolicy(DeleteCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteCustomPolicy);
    }

    /**
     * 移除用户组的所有项目服务权限
     * 该接口可以用于移除用户组的所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteDomainGroupInheritedRoleRequest 请求对象
     * @return DeleteDomainGroupInheritedRoleResponse
     */
    public DeleteDomainGroupInheritedRoleResponse deleteDomainGroupInheritedRole(DeleteDomainGroupInheritedRoleRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteDomainGroupInheritedRole);
    }

    /**
     * 添加IAM用户到用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)添加IAM用户到用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAddUserToGroupRequest 请求对象
     * @return KeystoneAddUserToGroupResponse
     */
    public KeystoneAddUserToGroupResponse keystoneAddUserToGroup(KeystoneAddUserToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
    }

    /**
     * 为用户组授予全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithDomainPermissionRequest 请求对象
     * @return KeystoneAssociateGroupWithDomainPermissionResponse
     */
    public KeystoneAssociateGroupWithDomainPermissionResponse keystoneAssociateGroupWithDomainPermission(KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithDomainPermission);
    }

    /**
     * 为用户组授予项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithProjectPermissionRequest 请求对象
     * @return KeystoneAssociateGroupWithProjectPermissionResponse
     */
    public KeystoneAssociateGroupWithProjectPermissionResponse keystoneAssociateGroupWithProjectPermission(KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithProjectPermission);
    }

    /**
     * 查询用户组是否拥有全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckDomainPermissionForGroupRequest 请求对象
     * @return KeystoneCheckDomainPermissionForGroupResponse
     */
    public KeystoneCheckDomainPermissionForGroupResponse keystoneCheckDomainPermissionForGroup(KeystoneCheckDomainPermissionForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckDomainPermissionForGroup);
    }

    /**
     * 查询用户组是否拥有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckProjectPermissionForGroupRequest 请求对象
     * @return KeystoneCheckProjectPermissionForGroupResponse
     */
    public KeystoneCheckProjectPermissionForGroupResponse keystoneCheckProjectPermissionForGroup(KeystoneCheckProjectPermissionForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckProjectPermissionForGroup);
    }

    /**
     * 查询IAM用户是否在用户组中
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户是否在用户组中。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckUserInGroupRequest 请求对象
     * @return KeystoneCheckUserInGroupResponse
     */
    public KeystoneCheckUserInGroupResponse keystoneCheckUserInGroup(KeystoneCheckUserInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckUserInGroup);
    }

    /**
     * 查询用户组是否拥有所有项目指定权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有所有项目指定权限。  该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckroleForGroupRequest 请求对象
     * @return KeystoneCheckroleForGroupResponse
     */
    public KeystoneCheckroleForGroupResponse keystoneCheckroleForGroup(KeystoneCheckroleForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckroleForGroup);
    }

    /**
     * 创建用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateGroupRequest 请求对象
     * @return KeystoneCreateGroupResponse
     */
    public KeystoneCreateGroupResponse keystoneCreateGroup(KeystoneCreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateGroup);
    }

    /**
     * 注册身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateIdentityProviderRequest 请求对象
     * @return KeystoneCreateIdentityProviderResponse
     */
    public KeystoneCreateIdentityProviderResponse keystoneCreateIdentityProvider(KeystoneCreateIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateIdentityProvider);
    }

    /**
     * 注册映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateMappingRequest 请求对象
     * @return KeystoneCreateMappingResponse
     */
    public KeystoneCreateMappingResponse keystoneCreateMapping(KeystoneCreateMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateMapping);
    }

    /**
     * 创建项目
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建项目。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProjectRequest 请求对象
     * @return KeystoneCreateProjectResponse
     */
    public KeystoneCreateProjectResponse keystoneCreateProject(KeystoneCreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateProject);
    }

    /**
     * 注册协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册协议（将协议关联到某一身份提供商）。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProtocolRequest 请求对象
     * @return KeystoneCreateProtocolResponse
     */
    public KeystoneCreateProtocolResponse keystoneCreateProtocol(KeystoneCreateProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateProtocol);
    }

    /**
     * 获取联邦认证scoped token
     * 该接口可以用于通过联邦认证方式获取scoped token。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateScopedTokenRequest 请求对象
     * @return KeystoneCreateScopedTokenResponse
     */
    public KeystoneCreateScopedTokenResponse keystoneCreateScopedToken(KeystoneCreateScopedTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateScopedToken);
    }

    /**
     * 删除用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteGroupRequest 请求对象
     * @return KeystoneDeleteGroupResponse
     */
    public KeystoneDeleteGroupResponse keystoneDeleteGroup(KeystoneDeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
    }

    /**
     * 删除身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html) 删除身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteIdentityProviderRequest 请求对象
     * @return KeystoneDeleteIdentityProviderResponse
     */
    public KeystoneDeleteIdentityProviderResponse keystoneDeleteIdentityProvider(KeystoneDeleteIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteIdentityProvider);
    }

    /**
     * 删除映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteMappingRequest 请求对象
     * @return KeystoneDeleteMappingResponse
     */
    public KeystoneDeleteMappingResponse keystoneDeleteMapping(KeystoneDeleteMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteMapping);
    }

    /**
     * 删除协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除协议。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteProtocolRequest 请求对象
     * @return KeystoneDeleteProtocolResponse
     */
    public KeystoneDeleteProtocolResponse keystoneDeleteProtocol(KeystoneDeleteProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteProtocol);
    }

    /**
     * 查询用户组的所有项目权限列表
     * 该接口可以用于管理员查询用户组所有项目服务权限列表。  \\n\\n该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return KeystoneListAllProjectPermissionsForGroupResponse
     */
    public KeystoneListAllProjectPermissionsForGroupResponse keystoneListAllProjectPermissionsForGroup(KeystoneListAllProjectPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAllProjectPermissionsForGroup);
    }

    /**
     * 查询IAM用户可以访问的账号详情
     * 该接口可以用于查询IAM用户可以用访问的账号详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthDomainsRequest 请求对象
     * @return KeystoneListAuthDomainsResponse
     */
    public KeystoneListAuthDomainsResponse keystoneListAuthDomains(KeystoneListAuthDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAuthDomains);
    }

    /**
     * 查询IAM用户可以访问的项目列表
     * 该接口可以用于查询IAM用户可以访问的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthProjectsRequest 请求对象
     * @return KeystoneListAuthProjectsResponse
     */
    public KeystoneListAuthProjectsResponse keystoneListAuthProjects(KeystoneListAuthProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAuthProjects);
    }

    /**
     * 查询全局服务中的用户组权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的用户组权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListDomainPermissionsForGroupRequest 请求对象
     * @return KeystoneListDomainPermissionsForGroupResponse
     */
    public KeystoneListDomainPermissionsForGroupResponse keystoneListDomainPermissionsForGroup(KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
    }

    /**
     * 查询终端节点列表
     * 该接口可以用于查询终端节点列表。终端节点用来提供服务访问入口。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListEndpointsRequest 请求对象
     * @return KeystoneListEndpointsResponse
     */
    public KeystoneListEndpointsResponse keystoneListEndpoints(KeystoneListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListEndpoints);
    }

    /**
     * 查询用户组列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsRequest 请求对象
     * @return KeystoneListGroupsResponse
     */
    public KeystoneListGroupsResponse keystoneListGroups(KeystoneListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroups);
    }

    /**
     * 查询身份提供商列表
     * 该接口可以用于查询身份提供商列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListIdentityProvidersRequest 请求对象
     * @return KeystoneListIdentityProvidersResponse
     */
    public KeystoneListIdentityProvidersResponse keystoneListIdentityProviders(KeystoneListIdentityProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListIdentityProviders);
    }

    /**
     * 查询映射列表
     * 该接口可以用于查询映射列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListMappingsRequest 请求对象
     * @return KeystoneListMappingsResponse
     */
    public KeystoneListMappingsResponse keystoneListMappings(KeystoneListMappingsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListMappings);
    }

    /**
     * 查询权限列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListPermissionsRequest 请求对象
     * @return KeystoneListPermissionsResponse
     */
    public KeystoneListPermissionsResponse keystoneListPermissions(KeystoneListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListPermissions);
    }

    /**
     * 查询项目服务中的用户组权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的用户组权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectPermissionsForGroupRequest 请求对象
     * @return KeystoneListProjectPermissionsForGroupResponse
     */
    public KeystoneListProjectPermissionsForGroupResponse keystoneListProjectPermissionsForGroup(KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
    }

    /**
     * 查询指定条件下的项目列表
     * 该接口可以用于查询指定条件下的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsRequest 请求对象
     * @return KeystoneListProjectsResponse
     */
    public KeystoneListProjectsResponse keystoneListProjects(KeystoneListProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjects);
    }

    /**
     * 查询指定IAM用户的项目列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的项目列表，或IAM用户查询自己的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsForUserRequest 请求对象
     * @return KeystoneListProjectsForUserResponse
     */
    public KeystoneListProjectsForUserResponse keystoneListProjectsForUser(KeystoneListProjectsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectsForUser);
    }

    /**
     * 查询协议列表
     * 该接口可以用于查询协议列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProtocolsRequest 请求对象
     * @return KeystoneListProtocolsResponse
     */
    public KeystoneListProtocolsResponse keystoneListProtocols(KeystoneListProtocolsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProtocols);
    }

    /**
     * 查询区域列表
     * 该接口可以用于查询区域列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListRegionsRequest 请求对象
     * @return KeystoneListRegionsResponse
     */
    public KeystoneListRegionsResponse keystoneListRegions(KeystoneListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListRegions);
    }

    /**
     * 查询服务列表
     * 该接口可以用于查询服务列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListServicesRequest 请求对象
     * @return KeystoneListServicesResponse
     */
    public KeystoneListServicesResponse keystoneListServices(KeystoneListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListServices);
    }

    /**
     * 管理员查询用户组所包含的IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组中所包含的IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersForGroupByAdminRequest 请求对象
     * @return KeystoneListUsersForGroupByAdminResponse
     */
    public KeystoneListUsersForGroupByAdminResponse keystoneListUsersForGroupByAdmin(KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
    }

    /**
     * 查询版本信息列表
     * 该接口用于查询Keystone API的版本信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListVersionsRequest 请求对象
     * @return KeystoneListVersionsResponse
     */
    public KeystoneListVersionsResponse keystoneListVersions(KeystoneListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListVersions);
    }

    /**
     * 移除用户组的全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveDomainPermissionFromGroupRequest 请求对象
     * @return KeystoneRemoveDomainPermissionFromGroupResponse
     */
    public KeystoneRemoveDomainPermissionFromGroupResponse keystoneRemoveDomainPermissionFromGroup(KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveDomainPermissionFromGroup);
    }

    /**
     * 移除用户组的项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveProjectPermissionFromGroupRequest 请求对象
     * @return KeystoneRemoveProjectPermissionFromGroupResponse
     */
    public KeystoneRemoveProjectPermissionFromGroupResponse keystoneRemoveProjectPermissionFromGroup(KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveProjectPermissionFromGroup);
    }

    /**
     * 移除用户组中的IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组中的IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveUserFromGroupRequest 请求对象
     * @return KeystoneRemoveUserFromGroupResponse
     */
    public KeystoneRemoveUserFromGroupResponse keystoneRemoveUserFromGroup(KeystoneRemoveUserFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveUserFromGroup);
    }

    /**
     * 查询服务目录
     * 该接口可以用于查询请求头中X-Auth-Token对应的服务目录。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowCatalogRequest 请求对象
     * @return KeystoneShowCatalogResponse
     */
    public KeystoneShowCatalogResponse keystoneShowCatalog(KeystoneShowCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowCatalog);
    }

    /**
     * 查询终端节点详情
     * 该接口可以用于查询终端节点详情。终端节点用来提供服务访问入口。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowEndpointRequest 请求对象
     * @return KeystoneShowEndpointResponse
     */
    public KeystoneShowEndpointResponse keystoneShowEndpoint(KeystoneShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowEndpoint);
    }

    /**
     * 查询用户组详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowGroupRequest 请求对象
     * @return KeystoneShowGroupResponse
     */
    public KeystoneShowGroupResponse keystoneShowGroup(KeystoneShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowGroup);
    }

    /**
     * 查询身份提供商详情
     * 该接口可以用于查询身份提供商详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowIdentityProviderRequest 请求对象
     * @return KeystoneShowIdentityProviderResponse
     */
    public KeystoneShowIdentityProviderResponse keystoneShowIdentityProvider(KeystoneShowIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowIdentityProvider);
    }

    /**
     * 查询映射详情
     * 该接口可以用于查询映射详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowMappingRequest 请求对象
     * @return KeystoneShowMappingResponse
     */
    public KeystoneShowMappingResponse keystoneShowMapping(KeystoneShowMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowMapping);
    }

    /**
     * 查询权限详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowPermissionRequest 请求对象
     * @return KeystoneShowPermissionResponse
     */
    public KeystoneShowPermissionResponse keystoneShowPermission(KeystoneShowPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowPermission);
    }

    /**
     * 查询项目详情
     * 该接口可以用于查询项目详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProjectRequest 请求对象
     * @return KeystoneShowProjectResponse
     */
    public KeystoneShowProjectResponse keystoneShowProject(KeystoneShowProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowProject);
    }

    /**
     * 查询协议详情
     * 该接口可以用于查询协议详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProtocolRequest 请求对象
     * @return KeystoneShowProtocolResponse
     */
    public KeystoneShowProtocolResponse keystoneShowProtocol(KeystoneShowProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowProtocol);
    }

    /**
     * 查询区域详情
     * 该接口可以用于查询区域详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowRegionRequest 请求对象
     * @return KeystoneShowRegionResponse
     */
    public KeystoneShowRegionResponse keystoneShowRegion(KeystoneShowRegionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowRegion);
    }

    /**
     * 查询账号密码强度策略
     * 该接口可以用于查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceRequest 请求对象
     * @return KeystoneShowSecurityComplianceResponse
     */
    public KeystoneShowSecurityComplianceResponse keystoneShowSecurityCompliance(KeystoneShowSecurityComplianceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowSecurityCompliance);
    }

    /**
     * 按条件查询账号密码强度策略
     * 该接口可以用于按条件查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceByOptionRequest 请求对象
     * @return KeystoneShowSecurityComplianceByOptionResponse
     */
    public KeystoneShowSecurityComplianceByOptionResponse keystoneShowSecurityComplianceByOption(KeystoneShowSecurityComplianceByOptionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowSecurityComplianceByOption);
    }

    /**
     * 查询服务详情
     * 该接口可以用于查询服务详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowServiceRequest 请求对象
     * @return KeystoneShowServiceResponse
     */
    public KeystoneShowServiceResponse keystoneShowService(KeystoneShowServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowService);
    }

    /**
     * 查询版本信息
     * 该接口用于查询Keystone API的3.0版本的信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowVersionRequest 请求对象
     * @return KeystoneShowVersionResponse
     */
    public KeystoneShowVersionResponse keystoneShowVersion(KeystoneShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowVersion);
    }

    /**
     * 更新用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新用户组信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateGroupRequest 请求对象
     * @return KeystoneUpdateGroupResponse
     */
    public KeystoneUpdateGroupResponse keystoneUpdateGroup(KeystoneUpdateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
    }

    /**
     * 更新身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateIdentityProviderRequest 请求对象
     * @return KeystoneUpdateIdentityProviderResponse
     */
    public KeystoneUpdateIdentityProviderResponse keystoneUpdateIdentityProvider(KeystoneUpdateIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateIdentityProvider);
    }

    /**
     * 更新映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateMappingRequest 请求对象
     * @return KeystoneUpdateMappingResponse
     */
    public KeystoneUpdateMappingResponse keystoneUpdateMapping(KeystoneUpdateMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateMapping);
    }

    /**
     * 修改项目信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改项目信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProjectRequest 请求对象
     * @return KeystoneUpdateProjectResponse
     */
    public KeystoneUpdateProjectResponse keystoneUpdateProject(KeystoneUpdateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateProject);
    }

    /**
     * 更新协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新协议。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProtocolRequest 请求对象
     * @return KeystoneUpdateProtocolResponse
     */
    public KeystoneUpdateProtocolResponse keystoneUpdateProtocol(KeystoneUpdateProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateProtocol);
    }

    /**
     * 查询指定条件下的委托列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定条件下的委托列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAgencies);
    }

    /**
     * 查询委托下的所有项目服务权限列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托所有项目服务权限列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAllProjectsPermissionsForAgencyRequest 请求对象
     * @return ListAllProjectsPermissionsForAgencyResponse
     */
    public ListAllProjectsPermissionsForAgencyResponse listAllProjectsPermissionsForAgency(ListAllProjectsPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAllProjectsPermissionsForAgency);
    }

    /**
     * 查询自定义策略列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListCustomPoliciesRequest 请求对象
     * @return ListCustomPoliciesResponse
     */
    public ListCustomPoliciesResponse listCustomPolicies(ListCustomPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listCustomPolicies);
    }

    /**
     * 查询全局服务中的委托权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的委托权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListDomainPermissionsForAgencyRequest 请求对象
     * @return ListDomainPermissionsForAgencyResponse
     */
    public ListDomainPermissionsForAgencyResponse listDomainPermissionsForAgency(ListDomainPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listDomainPermissionsForAgency);
    }

    /**
     * 查询项目服务中的委托权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的委托权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListProjectPermissionsForAgencyRequest 请求对象
     * @return ListProjectPermissionsForAgencyResponse
     */
    public ListProjectPermissionsForAgencyResponse listProjectPermissionsForAgency(ListProjectPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listProjectPermissionsForAgency);
    }

    /**
     * 移除委托下的所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveAllProjectsPermissionFromAgencyRequest 请求对象
     * @return RemoveAllProjectsPermissionFromAgencyResponse
     */
    public RemoveAllProjectsPermissionFromAgencyResponse removeAllProjectsPermissionFromAgency(RemoveAllProjectsPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeAllProjectsPermissionFromAgency);
    }

    /**
     * 移除委托的全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveDomainPermissionFromAgencyRequest 请求对象
     * @return RemoveDomainPermissionFromAgencyResponse
     */
    public RemoveDomainPermissionFromAgencyResponse removeDomainPermissionFromAgency(RemoveDomainPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeDomainPermissionFromAgency);
    }

    /**
     * 移除委托的项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveProjectPermissionFromAgencyRequest 请求对象
     * @return RemoveProjectPermissionFromAgencyResponse
     */
    public RemoveProjectPermissionFromAgencyResponse removeProjectPermissionFromAgency(RemoveProjectPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeProjectPermissionFromAgency);
    }

    /**
     * 查询委托详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowAgencyRequest 请求对象
     * @return ShowAgencyResponse
     */
    public ShowAgencyResponse showAgency(ShowAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showAgency);
    }

    /**
     * 查询自定义策略详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowCustomPolicyRequest 请求对象
     * @return ShowCustomPolicyResponse
     */
    public ShowCustomPolicyResponse showCustomPolicy(ShowCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showCustomPolicy);
    }

    /**
     * 查询账号接口访问策略
     * 该接口可以用于查询账号接口访问控制策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainApiAclPolicyRequest 请求对象
     * @return ShowDomainApiAclPolicyResponse
     */
    public ShowDomainApiAclPolicyResponse showDomainApiAclPolicy(ShowDomainApiAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainApiAclPolicy);
    }

    /**
     * 查询账号控制台访问策略
     * 该接口可以用于查询账号控制台访问控制策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainConsoleAclPolicyRequest 请求对象
     * @return ShowDomainConsoleAclPolicyResponse
     */
    public ShowDomainConsoleAclPolicyResponse showDomainConsoleAclPolicy(ShowDomainConsoleAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainConsoleAclPolicy);
    }

    /**
     * 查询账号登录策略
     * 该接口可以用于查询账号登录策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainLoginPolicyRequest 请求对象
     * @return ShowDomainLoginPolicyResponse
     */
    public ShowDomainLoginPolicyResponse showDomainLoginPolicy(ShowDomainLoginPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainLoginPolicy);
    }

    /**
     * 查询账号密码策略
     * 该接口可以用于查询账号密码策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainPasswordPolicyRequest 请求对象
     * @return ShowDomainPasswordPolicyResponse
     */
    public ShowDomainPasswordPolicyResponse showDomainPasswordPolicy(ShowDomainPasswordPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainPasswordPolicy);
    }

    /**
     * 查询账号操作保护策略
     * 该接口可以用于查询账号操作保护策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainProtectPolicyRequest 请求对象
     * @return ShowDomainProtectPolicyResponse
     */
    public ShowDomainProtectPolicyResponse showDomainProtectPolicy(ShowDomainProtectPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainProtectPolicy);
    }

    /**
     * 查询账号配额
     * 该接口可以用于查询账号配额。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return ShowDomainQuotaResponse
     */
    public ShowDomainQuotaResponse showDomainQuota(ShowDomainQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainQuota);
    }

    /**
     * 查询Metadata文件
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询身份提供商导入到IAM中的Metadata文件。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowMetadataRequest 请求对象
     * @return ShowMetadataResponse
     */
    public ShowMetadataResponse showMetadata(ShowMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showMetadata);
    }

    /**
     * 查询项目详情与状态
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目详情与状态。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectDetailsAndStatusRequest 请求对象
     * @return ShowProjectDetailsAndStatusResponse
     */
    public ShowProjectDetailsAndStatusResponse showProjectDetailsAndStatus(ShowProjectDetailsAndStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showProjectDetailsAndStatus);
    }

    /**
     * 查询项目配额
     * 该接口可以用于查询项目配额。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectQuotaRequest 请求对象
     * @return ShowProjectQuotaResponse
     */
    public ShowProjectQuotaResponse showProjectQuota(ShowProjectQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showProjectQuota);
    }

    /**
     * 修改委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyRequest 请求对象
     * @return UpdateAgencyResponse
     */
    public UpdateAgencyResponse updateAgency(UpdateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgency);
    }

    /**
     * 修改委托自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyCustomPolicyRequest 请求对象
     * @return UpdateAgencyCustomPolicyResponse
     */
    public UpdateAgencyCustomPolicyResponse updateAgencyCustomPolicy(UpdateAgencyCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgencyCustomPolicy);
    }

    /**
     * 修改云服务自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改云服务自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateCloudServiceCustomPolicyRequest 请求对象
     * @return UpdateCloudServiceCustomPolicyResponse
     */
    public UpdateCloudServiceCustomPolicyResponse updateCloudServiceCustomPolicy(UpdateCloudServiceCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateCloudServiceCustomPolicy);
    }

    /**
     * 修改账号接口访问策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号接口访问策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainApiAclPolicyRequest 请求对象
     * @return UpdateDomainApiAclPolicyResponse
     */
    public UpdateDomainApiAclPolicyResponse updateDomainApiAclPolicy(UpdateDomainApiAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainApiAclPolicy);
    }

    /**
     * 修改账号控制台访问策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号控制台访问策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainConsoleAclPolicyRequest 请求对象
     * @return UpdateDomainConsoleAclPolicyResponse
     */
    public UpdateDomainConsoleAclPolicyResponse updateDomainConsoleAclPolicy(UpdateDomainConsoleAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainConsoleAclPolicy);
    }

    /**
     * 为用户组授予所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/zh-cn_topic_0079496985.html)为用户组授予所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainGroupInheritRoleRequest 请求对象
     * @return UpdateDomainGroupInheritRoleResponse
     */
    public UpdateDomainGroupInheritRoleResponse updateDomainGroupInheritRole(UpdateDomainGroupInheritRoleRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainGroupInheritRole);
    }

    /**
     * 修改账号登录策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号登录策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainLoginPolicyRequest 请求对象
     * @return UpdateDomainLoginPolicyResponse
     */
    public UpdateDomainLoginPolicyResponse updateDomainLoginPolicy(UpdateDomainLoginPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainLoginPolicy);
    }

    /**
     * 修改账号密码策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号密码策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainPasswordPolicyRequest 请求对象
     * @return UpdateDomainPasswordPolicyResponse
     */
    public UpdateDomainPasswordPolicyResponse updateDomainPasswordPolicy(UpdateDomainPasswordPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainPasswordPolicy);
    }

    /**
     * 修改账号操作保护策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainProtectPolicyRequest 请求对象
     * @return UpdateDomainProtectPolicyResponse
     */
    public UpdateDomainProtectPolicyResponse updateDomainProtectPolicy(UpdateDomainProtectPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainProtectPolicy);
    }

    /**
     * 设置项目状态
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)设置项目状态。项目状态包括：正常、冻结。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateProjectStatusRequest 请求对象
     * @return UpdateProjectStatusResponse
     */
    public UpdateProjectStatusResponse updateProjectStatus(UpdateProjectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateProjectStatus);
    }

    /**
     * 创建永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)给IAM用户创建永久访问密钥，或IAM用户给自己创建永久访问密钥。    访问密钥（Access Key ID/Secret Access Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问华为云时的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。在控制台创建访问密钥的方式请参见：[访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html)  。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreatePermanentAccessKeyRequest 请求对象
     * @return CreatePermanentAccessKeyResponse
     */
    public CreatePermanentAccessKeyResponse createPermanentAccessKey(CreatePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createPermanentAccessKey);
    }

    /**
     * 通过委托获取临时访问密钥
     * 该接口可以用于通过委托来获取临时访问密钥（临时AK/SK）和securitytoken。    临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html) 。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByAgencyRequest 请求对象
     * @return CreateTemporaryAccessKeyByAgencyResponse
     */
    public CreateTemporaryAccessKeyByAgencyResponse createTemporaryAccessKeyByAgency(CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
    }

    /**
     * 通过token获取临时访问密钥
     * 该接口可以用于通过token来获取临时AK/SK和securitytoken。    临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByTokenRequest 请求对象
     * @return CreateTemporaryAccessKeyByTokenResponse
     */
    public CreateTemporaryAccessKeyByTokenResponse createTemporaryAccessKeyByToken(CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
    }

    /**
     * 删除指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除IAM用户的指定永久访问密钥，或IAM用户删除自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeletePermanentAccessKeyRequest 请求对象
     * @return DeletePermanentAccessKeyResponse
     */
    public DeletePermanentAccessKeyResponse deletePermanentAccessKey(DeletePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deletePermanentAccessKey);
    }

    /**
     * 查询所有永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的所有永久访问密钥，或IAM用户查询自己的所有永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListPermanentAccessKeysRequest 请求对象
     * @return ListPermanentAccessKeysResponse
     */
    public ListPermanentAccessKeysResponse listPermanentAccessKeys(ListPermanentAccessKeysRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listPermanentAccessKeys);
    }

    /**
     * 查询指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的指定永久访问密钥，或IAM用户查询自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowPermanentAccessKeyRequest 请求对象
     * @return ShowPermanentAccessKeyResponse
     */
    public ShowPermanentAccessKeyResponse showPermanentAccessKey(ShowPermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showPermanentAccessKey);
    }

    /**
     * 修改指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户的指定永久访问密钥，或IAM用户修改自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdatePermanentAccessKeyRequest 请求对象
     * @return UpdatePermanentAccessKeyResponse
     */
    public UpdatePermanentAccessKeyResponse updatePermanentAccessKey(UpdatePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updatePermanentAccessKey);
    }

    /**
     * 绑定MFA设备
     * 该接口可以用于绑定MFA设备。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateBindingDeviceRequest 请求对象
     * @return CreateBindingDeviceResponse
     */
    public CreateBindingDeviceResponse createBindingDevice(CreateBindingDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createBindingDevice);
    }

    /**
     * 创建MFA设备
     * 该接口可以用于创建MFA设备。  该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMfaDeviceRequest 请求对象
     * @return CreateMfaDeviceResponse
     */
    public CreateMfaDeviceResponse createMfaDevice(CreateMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createMfaDevice);
    }

    /**
     * 管理员创建IAM用户（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateUserRequest 请求对象
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createUser);
    }

    /**
     * 解绑MFA设备
     * 该接口可以用于解绑MFA设备   该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteBindingDeviceRequest 请求对象
     * @return DeleteBindingDeviceResponse
     */
    public DeleteBindingDeviceResponse deleteBindingDevice(DeleteBindingDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteBindingDevice);
    }

    /**
     * 删除MFA设备
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除MFA设备。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteMfaDeviceRequest 请求对象
     * @return DeleteMfaDeviceResponse
     */
    public DeleteMfaDeviceResponse deleteMfaDevice(DeleteMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteMfaDevice);
    }

    /**
     * 管理员创建IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。IAM用户首次登录时需要修改密码。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateUserRequest 请求对象
     * @return KeystoneCreateUserResponse
     */
    public KeystoneCreateUserResponse keystoneCreateUser(KeystoneCreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUser);
    }

    /**
     * 管理员删除IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除指定IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteUserRequest 请求对象
     * @return KeystoneDeleteUserResponse
     */
    public KeystoneDeleteUserResponse keystoneDeleteUser(KeystoneDeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteUser);
    }

    /**
     * 查询IAM用户所属用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户所属用户组，或IAM用户查询自己所属用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsForUserRequest 请求对象
     * @return KeystoneListGroupsForUserResponse
     */
    public KeystoneListGroupsForUserResponse keystoneListGroupsForUser(KeystoneListGroupsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
    }

    /**
     * 管理员查询IAM用户列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersRequest 请求对象
     * @return KeystoneListUsersResponse
     */
    public KeystoneListUsersResponse keystoneListUsers(KeystoneListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsers);
    }

    /**
     * 查询IAM用户详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的用户详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowUserRequest 请求对象
     * @return KeystoneShowUserResponse
     */
    public KeystoneShowUserResponse keystoneShowUser(KeystoneShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowUser);
    }

    /**
     * 管理员修改IAM用户信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserByAdminRequest 请求对象
     * @return KeystoneUpdateUserByAdminResponse
     */
    public KeystoneUpdateUserByAdminResponse keystoneUpdateUserByAdmin(KeystoneUpdateUserByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
    }

    /**
     * 修改IAM用户密码
     * 该接口可以用于IAM用户修改自己的密码。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserPasswordRequest 请求对象
     * @return KeystoneUpdateUserPasswordResponse
     */
    public KeystoneUpdateUserPasswordResponse keystoneUpdateUserPassword(KeystoneUpdateUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
    }

    /**
     * 查询IAM用户的登录保护状态信息列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的登录保护状态列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserLoginProtectsRequest 请求对象
     * @return ListUserLoginProtectsResponse
     */
    public ListUserLoginProtectsResponse listUserLoginProtects(ListUserLoginProtectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listUserLoginProtects);
    }

    /**
     * 该接口可以用于获取MFA设备。
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的MFA绑定信息列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserMfaDevicesRequest 请求对象
     * @return ListUserMfaDevicesResponse
     */
    public ListUserMfaDevicesResponse listUserMfaDevices(ListUserMfaDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listUserMfaDevices);
    }

    /**
     * 查询IAM用户详情（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserRequest 请求对象
     * @return ShowUserResponse
     */
    public ShowUserResponse showUser(ShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUser);
    }

    /**
     * 查询指定IAM用户的登录保护状态信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的登录保护状态信息，或IAM用户查询自己的登录保护状态信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserLoginProtectRequest 请求对象
     * @return ShowUserLoginProtectResponse
     */
    public ShowUserLoginProtectResponse showUserLoginProtect(ShowUserLoginProtectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUserLoginProtect);
    }

    /**
     * 查询指定IAM用户的MFA绑定信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的MFA绑定信息，或IAM用户查询自己的MFA绑定信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserMfaDeviceRequest 请求对象
     * @return ShowUserMfaDeviceResponse
     */
    public ShowUserMfaDeviceResponse showUserMfaDevice(ShowUserMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUserMfaDevice);
    }

    /**
     * 修改IAM用户登录保护状态信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateLoginProtectRequest 请求对象
     * @return UpdateLoginProtectResponse
     */
    public UpdateLoginProtectResponse updateLoginProtect(UpdateLoginProtectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateLoginProtect);
    }

    /**
     * 管理员修改IAM用户信息（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息 。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUser);
    }

    /**
     * 修改IAM用户信息（推荐）
     * 该接口可以用于IAM用户修改自己的用户信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserInformationRequest 请求对象
     * @return UpdateUserInformationResponse
     */
    public UpdateUserInformationResponse updateUserInformation(UpdateUserInformationRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUserInformation);
    }

    /**
     * 获取委托Token
     * 该接口可以用于获取委托方的token。    例如：A账号希望B账号管理自己的某些资源，所以A账号创建了委托给B账号，则A账号为委托方，B账号为被委托方。那么B账号可以通过该接口获取委托token。B账号仅能使用该token管理A账号的委托资源，不能管理自己账号中的资源。如果B账号需要管理自己账号中的资源，则需要获取自己的用户token。    token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。    &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     *
     * @param KeystoneCreateAgencyTokenRequest 请求对象
     * @return KeystoneCreateAgencyTokenResponse
     */
    public KeystoneCreateAgencyTokenResponse keystoneCreateAgencyToken(KeystoneCreateAgencyTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateAgencyToken);
    }

    /**
     * 获取IAM用户Token（使用密码）
     * 该接口可以用于通过用户名/密码的方式进行认证来获取IAM用户token。    token是系统颁发给IAM用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的IAM用户token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。   &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。   &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。   &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordRequest 请求对象
     * @return KeystoneCreateUserTokenByPasswordResponse
     */
    public KeystoneCreateUserTokenByPasswordResponse keystoneCreateUserTokenByPassword(KeystoneCreateUserTokenByPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPassword);
    }

    /**
     * 获取IAM用户Token（使用密码+虚拟MFA）
     * 该接口可以用于通过用户名/密码+虚拟MFA的方式进行认证，在IAM用户开启了的登录保护功能，并选择通过虚拟MFA验证时获取IAM用户token。    token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。   &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。   &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。   &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordAndMfaRequest 请求对象
     * @return KeystoneCreateUserTokenByPasswordAndMfaResponse
     */
    public KeystoneCreateUserTokenByPasswordAndMfaResponse keystoneCreateUserTokenByPasswordAndMfa(KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa);
    }

    /**
     * 校验Token的有效性
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)校验本账号中IAM用户token的有效性，或IAM用户校验自己token的有效性。管理员仅能校验本账号中IAM用户token的有效性，不能校验其他账号中IAM用户token的有效性。如果被校验的token有效，则返回该token的详细信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneValidateTokenRequest 请求对象
     * @return KeystoneValidateTokenResponse
     */
    public KeystoneValidateTokenResponse keystoneValidateToken(KeystoneValidateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneValidateToken);
    }

}