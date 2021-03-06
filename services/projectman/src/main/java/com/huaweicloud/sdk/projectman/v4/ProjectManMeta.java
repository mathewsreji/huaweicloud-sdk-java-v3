package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.projectman.v4.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class ProjectManMeta {

    public static final HttpRequestDef<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgc = genForaddApplyJoinProjectForAgc();

    private static HttpRequestDef<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> genForaddApplyJoinProjectForAgc() {
        // basic
        HttpRequestDef.Builder<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, AddApplyJoinProjectForAgcRequest.class, AddApplyJoinProjectForAgcResponse.class)
                .withUri("/v4/projects/{project_id}/members/agc-join")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("Domain-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("User-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMemberV4Request, AddMemberV4Response> addMemberV4 = genForaddMemberV4();

    private static HttpRequestDef<AddMemberV4Request, AddMemberV4Response> genForaddMemberV4() {
        // basic
        HttpRequestDef.Builder<AddMemberV4Request, AddMemberV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddMemberV4Request.class, AddMemberV4Response.class)
                .withUri("/v4/projects/{project_id}/member")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddMemberV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddMemberRequestV4.class,
            f -> f.withMarshaller(AddMemberV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddMembersV4Request, BatchAddMembersV4Response> batchAddMembersV4 = genForbatchAddMembersV4();

    private static HttpRequestDef<BatchAddMembersV4Request, BatchAddMembersV4Response> genForbatchAddMembersV4() {
        // basic
        HttpRequestDef.Builder<BatchAddMembersV4Request, BatchAddMembersV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddMembersV4Request.class, BatchAddMembersV4Response.class)
                .withUri("/v4/projects/{project_id}/members")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchAddMembersV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchAddMembersV4RequestBody.class,
            f -> f.withMarshaller(BatchAddMembersV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> batchDeleteIterationsV4 = genForbatchDeleteIterationsV4();

    private static HttpRequestDef<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> genForbatchDeleteIterationsV4() {
        // basic
        HttpRequestDef.Builder<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteIterationsV4Request.class, BatchDeleteIterationsV4Response.class)
                .withUri("/v4/projects/{project_id}/iterations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteIterationsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteIterationsV4RequestBody.class,
            f -> f.withMarshaller(BatchDeleteIterationsV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> batchDeleteMembersV4 = genForbatchDeleteMembersV4();

    private static HttpRequestDef<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> genForbatchDeleteMembersV4() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteMembersV4Request.class, BatchDeleteMembersV4Response.class)
                .withUri("/v4/projects/{project_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteMembersV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteMembersV4RequestBody.class,
            f -> f.withMarshaller(BatchDeleteMembersV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckProjectNameV4Request, CheckProjectNameV4Response> checkProjectNameV4 = genForcheckProjectNameV4();

    private static HttpRequestDef<CheckProjectNameV4Request, CheckProjectNameV4Response> genForcheckProjectNameV4() {
        // basic
        HttpRequestDef.Builder<CheckProjectNameV4Request, CheckProjectNameV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckProjectNameV4Request.class, CheckProjectNameV4Response.class)
                .withUri("/v4/projects/check-name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CheckProjectNameRequestV4.class,
            f -> f.withMarshaller(CheckProjectNameV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIterationV4Request, CreateIterationV4Response> createIterationV4 = genForcreateIterationV4();

    private static HttpRequestDef<CreateIterationV4Request, CreateIterationV4Response> genForcreateIterationV4() {
        // basic
        HttpRequestDef.Builder<CreateIterationV4Request, CreateIterationV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIterationV4Request.class, CreateIterationV4Response.class)
                .withUri("/v4/projects/{project_id}/iteration")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateIterationV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateIterationRequestV4.class,
            f -> f.withMarshaller(CreateIterationV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectV4Request, CreateProjectV4Response> createProjectV4 = genForcreateProjectV4();

    private static HttpRequestDef<CreateProjectV4Request, CreateProjectV4Response> genForcreateProjectV4() {
        // basic
        HttpRequestDef.Builder<CreateProjectV4Request, CreateProjectV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectV4Request.class, CreateProjectV4Response.class)
                .withUri("/v4/project")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateProjectV4RequestBody.class,
            f -> f.withMarshaller(CreateProjectV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIterationV4Request, DeleteIterationV4Response> deleteIterationV4 = genFordeleteIterationV4();

    private static HttpRequestDef<DeleteIterationV4Request, DeleteIterationV4Response> genFordeleteIterationV4() {
        // basic
        HttpRequestDef.Builder<DeleteIterationV4Request, DeleteIterationV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIterationV4Request.class, DeleteIterationV4Response.class)
                .withUri("/v4/projects/{project_id}/iterations/{iteration_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteIterationV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteIterationV4Request::getIterationId, (req, v) -> {
                req.setIterationId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectV4Request, DeleteProjectV4Response> deleteProjectV4 = genFordeleteProjectV4();

    private static HttpRequestDef<DeleteProjectV4Request, DeleteProjectV4Response> genFordeleteProjectV4() {
        // basic
        HttpRequestDef.Builder<DeleteProjectV4Request, DeleteProjectV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProjectV4Request.class, DeleteProjectV4Response.class)
                .withUri("/v4/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteProjectV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4 = genForlistDomainNotAddedProjectsV4();

    private static HttpRequestDef<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> genForlistDomainNotAddedProjectsV4() {
        // basic
        HttpRequestDef.Builder<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainNotAddedProjectsV4Request.class, ListDomainNotAddedProjectsV4Response.class)
                .withUri("/v4/projects/domain/not-added")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDomainNotAddedProjectsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDomainNotAddedProjectsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> listProjectBugStaticsV4 = genForlistProjectBugStaticsV4();

    private static HttpRequestDef<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> genForlistProjectBugStaticsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectBugStaticsV4Request.class, ListProjectBugStaticsV4Response.class)
                .withUri("/v4/projects/{project_id}/bug-statistic")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProjectBugStaticsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> listProjectDemandStaticV4 = genForlistProjectDemandStaticV4();

    private static HttpRequestDef<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> genForlistProjectDemandStaticV4() {
        // basic
        HttpRequestDef.Builder<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectDemandStaticV4Request.class, ListProjectDemandStaticV4Response.class)
                .withUri("/v4/projects/{project_id}/demand-statistic")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProjectDemandStaticV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectIterationsV4Request, ListProjectIterationsV4Response> listProjectIterationsV4 = genForlistProjectIterationsV4();

    private static HttpRequestDef<ListProjectIterationsV4Request, ListProjectIterationsV4Response> genForlistProjectIterationsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectIterationsV4Request, ListProjectIterationsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectIterationsV4Request.class, ListProjectIterationsV4Response.class)
                .withUri("/v4/projects/{project_id}/iterations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProjectIterationsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4 = genForlistProjectMembersV4();

    private static HttpRequestDef<ListProjectMembersV4Request, ListProjectMembersV4Response> genForlistProjectMembersV4() {
        // basic
        HttpRequestDef.Builder<ListProjectMembersV4Request, ListProjectMembersV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectMembersV4Request.class, ListProjectMembersV4Response.class)
                .withUri("/v4/projects/{project_id}/members")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProjectMembersV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProjectMembersV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProjectMembersV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4 = genForlistProjectsV4();

    private static HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> genForlistProjectsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectsV4Request, ListProjectsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectsV4Request.class, ListProjectsV4Response.class)
                .withUri("/v4/projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListProjectsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListProjectsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );
        builder.withRequestField("project_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getProjectType, (req, v) -> {
                req.setProjectType(v);
            })
        );
        builder.withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getSort, (req, v) -> {
                req.setSort(v);
            })
        );
        builder.withRequestField("archive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getArchive, (req, v) -> {
                req.setArchive(v);
            })
        );
        builder.withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getQueryType, (req, v) -> {
                req.setQueryType(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveProjectRequest, RemoveProjectResponse> removeProject = genForremoveProject();

    private static HttpRequestDef<RemoveProjectRequest, RemoveProjectResponse> genForremoveProject() {
        // basic
        HttpRequestDef.Builder<RemoveProjectRequest, RemoveProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveProjectRequest.class, RemoveProjectResponse.class)
                .withUri("/v4/projects/{project_id}/quit")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemoveProjectRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfo = genForshowCurUserInfo();

    private static HttpRequestDef<ShowCurUserInfoRequest, ShowCurUserInfoResponse> genForshowCurUserInfo() {
        // basic
        HttpRequestDef.Builder<ShowCurUserInfoRequest, ShowCurUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCurUserInfoRequest.class, ShowCurUserInfoResponse.class)
                .withUri("/v4/user")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCurUserRoleRequest, ShowCurUserRoleResponse> showCurUserRole = genForshowCurUserRole();

    private static HttpRequestDef<ShowCurUserRoleRequest, ShowCurUserRoleResponse> genForshowCurUserRole() {
        // basic
        HttpRequestDef.Builder<ShowCurUserRoleRequest, ShowCurUserRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCurUserRoleRequest.class, ShowCurUserRoleResponse.class)
                .withUri("/v4/projects/{project_id}/user-role")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCurUserRoleRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIterationV4Request, ShowIterationV4Response> showIterationV4 = genForshowIterationV4();

    private static HttpRequestDef<ShowIterationV4Request, ShowIterationV4Response> genForshowIterationV4() {
        // basic
        HttpRequestDef.Builder<ShowIterationV4Request, ShowIterationV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIterationV4Request.class, ShowIterationV4Response.class)
                .withUri("/v4/iterations/{iteration_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowIterationV4Request::getIterationId, (req, v) -> {
                req.setIterationId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> showProjectSummaryV4 = genForshowProjectSummaryV4();

    private static HttpRequestDef<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> genForshowProjectSummaryV4() {
        // basic
        HttpRequestDef.Builder<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectSummaryV4Request.class, ShowProjectSummaryV4Response.class)
                .withUri("/v4/projects/{project_id}/summary")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProjectSummaryV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIterationV4Request, UpdateIterationV4Response> updateIterationV4 = genForupdateIterationV4();

    private static HttpRequestDef<UpdateIterationV4Request, UpdateIterationV4Response> genForupdateIterationV4() {
        // basic
        HttpRequestDef.Builder<UpdateIterationV4Request, UpdateIterationV4Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIterationV4Request.class, UpdateIterationV4Response.class)
                .withUri("/v4/projects/{project_id}/iterations/{iteration_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateIterationV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateIterationV4Request::getIterationId, (req, v) -> {
                req.setIterationId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateIterationRequestV4.class,
            f -> f.withMarshaller(UpdateIterationV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4 = genForupdateMembesRoleV4();

    private static HttpRequestDef<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> genForupdateMembesRoleV4() {
        // basic
        HttpRequestDef.Builder<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateMembesRoleV4Request.class, UpdateMembesRoleV4Response.class)
                .withUri("/v4/projects/{project_id}/members/role")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMembesRoleV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateMembesRoleV4RequestBody.class,
            f -> f.withMarshaller(UpdateMembesRoleV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNickNameV4Request, UpdateNickNameV4Response> updateNickNameV4 = genForupdateNickNameV4();

    private static HttpRequestDef<UpdateNickNameV4Request, UpdateNickNameV4Response> genForupdateNickNameV4() {
        // basic
        HttpRequestDef.Builder<UpdateNickNameV4Request, UpdateNickNameV4Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNickNameV4Request.class, UpdateNickNameV4Response.class)
                .withUri("/v4/user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateUserNickNameRequestV4.class,
            f -> f.withMarshaller(UpdateNickNameV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectV4Request, UpdateProjectV4Response> updateProjectV4 = genForupdateProjectV4();

    private static HttpRequestDef<UpdateProjectV4Request, UpdateProjectV4Response> genForupdateProjectV4() {
        // basic
        HttpRequestDef.Builder<UpdateProjectV4Request, UpdateProjectV4Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectV4Request.class, UpdateProjectV4Response.class)
                .withUri("/v4/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateProjectV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateProjectRequestV4.class,
            f -> f.withMarshaller(UpdateProjectV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> batchDeleteIssuesV4 = genForbatchDeleteIssuesV4();

    private static HttpRequestDef<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> genForbatchDeleteIssuesV4() {
        // basic
        HttpRequestDef.Builder<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteIssuesV4Request.class, BatchDeleteIssuesV4Response.class)
                .withUri("/v4/projects/{project_id}/issues")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteIssuesV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDelelteIssuesRequestV4.class,
            f -> f.withMarshaller(BatchDeleteIssuesV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIssueV4Request, CreateIssueV4Response> createIssueV4 = genForcreateIssueV4();

    private static HttpRequestDef<CreateIssueV4Request, CreateIssueV4Response> genForcreateIssueV4() {
        // basic
        HttpRequestDef.Builder<CreateIssueV4Request, CreateIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIssueV4Request.class, CreateIssueV4Response.class)
                .withUri("/v4/projects/{project_id}/issue")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateIssueRequestV4.class,
            f -> f.withMarshaller(CreateIssueV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIssueV4Request, DeleteIssueV4Response> deleteIssueV4 = genFordeleteIssueV4();

    private static HttpRequestDef<DeleteIssueV4Request, DeleteIssueV4Response> genFordeleteIssueV4() {
        // basic
        HttpRequestDef.Builder<DeleteIssueV4Request, DeleteIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIssueV4Request.class, DeleteIssueV4Response.class)
                .withUri("/v4/projects/{project_id}/issues/{issue_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteIssueV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChildIssuesV4Request, ListChildIssuesV4Response> listChildIssuesV4 = genForlistChildIssuesV4();

    private static HttpRequestDef<ListChildIssuesV4Request, ListChildIssuesV4Response> genForlistChildIssuesV4() {
        // basic
        HttpRequestDef.Builder<ListChildIssuesV4Request, ListChildIssuesV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChildIssuesV4Request.class, ListChildIssuesV4Response.class)
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/child")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListChildIssuesV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListChildIssuesV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4 = genForlistIssueCommentsV4();

    private static HttpRequestDef<ListIssueCommentsV4Request, ListIssueCommentsV4Response> genForlistIssueCommentsV4() {
        // basic
        HttpRequestDef.Builder<ListIssueCommentsV4Request, ListIssueCommentsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssueCommentsV4Request.class, ListIssueCommentsV4Response.class)
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/comments")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListIssueCommentsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListIssueCommentsV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssueCommentsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssueCommentsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4 = genForlistIssueRecordsV4();

    private static HttpRequestDef<ListIssueRecordsV4Request, ListIssueRecordsV4Response> genForlistIssueRecordsV4() {
        // basic
        HttpRequestDef.Builder<ListIssueRecordsV4Request, ListIssueRecordsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssueRecordsV4Request.class, ListIssueRecordsV4Response.class)
                .withUri("/v4/projects/{project_id}/issue/{issue_id}/records")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListIssueRecordsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListIssueRecordsV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssueRecordsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssueRecordsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssuesV4Request, ListIssuesV4Response> listIssuesV4 = genForlistIssuesV4();

    private static HttpRequestDef<ListIssuesV4Request, ListIssuesV4Response> genForlistIssuesV4() {
        // basic
        HttpRequestDef.Builder<ListIssuesV4Request, ListIssuesV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIssuesV4Request.class, ListIssuesV4Response.class)
                .withUri("/v4/projects/{project_id}/issues")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListIssuesV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListIssueRequestV4.class,
            f -> f.withMarshaller(ListIssuesV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHours = genForlistProjectWorkHours();

    private static HttpRequestDef<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> genForlistProjectWorkHours() {
        // basic
        HttpRequestDef.Builder<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListProjectWorkHoursRequest.class, ListProjectWorkHoursResponse.class)
                .withUri("/v4/projects/work-hours")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListProjectWorkHoursRequestBody.class,
            f -> f.withMarshaller(ListProjectWorkHoursRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssueV4Request, ShowIssueV4Response> showIssueV4 = genForshowIssueV4();

    private static HttpRequestDef<ShowIssueV4Request, ShowIssueV4Response> genForshowIssueV4() {
        // basic
        HttpRequestDef.Builder<ShowIssueV4Request, ShowIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIssueV4Request.class, ShowIssueV4Response.class)
                .withUri("/v4/projects/{project_id}/issues/{issue_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowIssueV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHours = genForshowProjectWorkHours();

    private static HttpRequestDef<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> genForshowProjectWorkHours() {
        // basic
        HttpRequestDef.Builder<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowProjectWorkHoursRequest.class, ShowProjectWorkHoursResponse.class)
                .withUri("/v4/projects/{project_id}/work-hours")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProjectWorkHoursRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShowProjectWorkHoursRequestBody.class,
            f -> f.withMarshaller(ShowProjectWorkHoursRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse> showtIssueCompletionRate = genForshowtIssueCompletionRate();

    private static HttpRequestDef<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse> genForshowtIssueCompletionRate() {
        // basic
        HttpRequestDef.Builder<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowtIssueCompletionRateRequest.class, ShowtIssueCompletionRateResponse.class)
                .withUri("/v4/projects/{project_id}/issue-completion-rate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowtIssueCompletionRateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIssueV4Request, UpdateIssueV4Response> updateIssueV4 = genForupdateIssueV4();

    private static HttpRequestDef<UpdateIssueV4Request, UpdateIssueV4Response> genForupdateIssueV4() {
        // basic
        HttpRequestDef.Builder<UpdateIssueV4Request, UpdateIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIssueV4Request.class, UpdateIssueV4Response.class)
                .withUri("/v4/projects/{project_id}/issues/{issue_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateIssueV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            IssueRequestV4.class,
            f -> f.withMarshaller(UpdateIssueV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
