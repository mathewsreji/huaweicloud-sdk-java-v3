package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotda.v5.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class IoTDAMeta {

    public static final HttpRequestDef<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCode = genForcreateAccessCode();

    private static HttpRequestDef<CreateAccessCodeRequest, CreateAccessCodeResponse> genForcreateAccessCode() {
        // basic
        HttpRequestDef.Builder<CreateAccessCodeRequest, CreateAccessCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessCodeRequest.class, CreateAccessCodeResponse.class)
                .withUri("/v5/iot/{project_id}/auth/accesscode")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAccessCodeRequest::getSpAuthToken, (req, v) -> {
                req.setSpAuthToken(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAccessCodeRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAccessCodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAccessCodeRequestBody.class,
            f -> f.withMarshaller(CreateAccessCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddQueueRequest, AddQueueResponse> addQueue = genForaddQueue();

    private static HttpRequestDef<AddQueueRequest, AddQueueResponse> genForaddQueue() {
        // basic
        HttpRequestDef.Builder<AddQueueRequest, AddQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddQueueRequest.class, AddQueueResponse.class)
                .withUri("/v5/iot/{project_id}/amqp-queues")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddQueueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueueInfo.class,
            f -> f.withMarshaller(AddQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowQueueRequest, BatchShowQueueResponse> batchShowQueue = genForbatchShowQueue();

    private static HttpRequestDef<BatchShowQueueRequest, BatchShowQueueResponse> genForbatchShowQueue() {
        // basic
        HttpRequestDef.Builder<BatchShowQueueRequest, BatchShowQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowQueueRequest.class, BatchShowQueueResponse.class)
                .withUri("/v5/iot/{project_id}/amqp-queues")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchShowQueueRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(BatchShowQueueRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchShowQueueRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(BatchShowQueueRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchShowQueueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> deleteQueue = genFordeleteQueue();

    private static HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> genFordeleteQueue() {
        // basic
        HttpRequestDef.Builder<DeleteQueueRequest, DeleteQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueueRequest.class, DeleteQueueResponse.class)
                .withUri("/v5/iot/{project_id}/amqp-queues/{queue_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteQueueRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteQueueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteQueueResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueRequest, ShowQueueResponse> showQueue = genForshowQueue();

    private static HttpRequestDef<ShowQueueRequest, ShowQueueResponse> genForshowQueue() {
        // basic
        HttpRequestDef.Builder<ShowQueueRequest, ShowQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueueRequest.class, ShowQueueResponse.class)
                .withUri("/v5/iot/{project_id}/amqp-queues/{queue_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowQueueRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowQueueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddApplicationRequest, AddApplicationResponse> addApplication = genForaddApplication();

    private static HttpRequestDef<AddApplicationRequest, AddApplicationResponse> genForaddApplication() {
        // basic
        HttpRequestDef.Builder<AddApplicationRequest, AddApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddApplicationRequest.class, AddApplicationResponse.class)
                .withUri("/v5/iot/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddApplicationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddApplication.class,
            f -> f.withMarshaller(AddApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication = genFordeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genFordeleteApplication() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationRequest, DeleteApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApplicationRequest.class, DeleteApplicationResponse.class)
                .withUri("/v5/iot/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApplicationRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteApplicationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteApplicationResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> showApplication = genForshowApplication();

    private static HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> genForshowApplication() {
        // basic
        HttpRequestDef.Builder<ShowApplicationRequest, ShowApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationRequest.class, ShowApplicationResponse.class)
                .withUri("/v5/iot/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowApplicationRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowApplicationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> showApplications = genForshowApplications();

    private static HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> genForshowApplications() {
        // basic
        HttpRequestDef.Builder<ShowApplicationsRequest, ShowApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationsRequest.class, ShowApplicationsResponse.class)
                .withUri("/v5/iot/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("default_app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ShowApplicationsRequest::getDefaultApp, (req, v) -> {
                req.setDefaultApp(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowApplicationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAsyncCommandRequest, CreateAsyncCommandResponse> createAsyncCommand = genForcreateAsyncCommand();

    private static HttpRequestDef<CreateAsyncCommandRequest, CreateAsyncCommandResponse> genForcreateAsyncCommand() {
        // basic
        HttpRequestDef.Builder<CreateAsyncCommandRequest, CreateAsyncCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAsyncCommandRequest.class, CreateAsyncCommandResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAsyncCommandRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAsyncCommandRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAsyncCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AsyncDeviceCommandRequest.class,
            f -> f.withMarshaller(CreateAsyncCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> showAsyncDeviceCommand = genForshowAsyncDeviceCommand();

    private static HttpRequestDef<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> genForshowAsyncDeviceCommand() {
        // basic
        HttpRequestDef.Builder<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAsyncDeviceCommandRequest.class, ShowAsyncDeviceCommandResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands/{command_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTask = genForcreateBatchTask();

    private static HttpRequestDef<CreateBatchTaskRequest, CreateBatchTaskResponse> genForcreateBatchTask() {
        // basic
        HttpRequestDef.Builder<CreateBatchTaskRequest, CreateBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBatchTaskRequest.class, CreateBatchTaskResponse.class)
                .withUri("/v5/iot/{project_id}/batchtasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBatchTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateBatchTask.class,
            f -> f.withMarshaller(CreateBatchTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasks = genForlistBatchTasks();

    private static HttpRequestDef<ListBatchTasksRequest, ListBatchTasksResponse> genForlistBatchTasks() {
        // basic
        HttpRequestDef.Builder<ListBatchTasksRequest, ListBatchTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchTasksRequest.class, ListBatchTasksResponse.class)
                .withUri("/v5/iot/{project_id}/batchtasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBatchTasksRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBatchTasksRequest::getTaskType, (req, v) -> {
                req.setTaskType(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBatchTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBatchTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBatchTasksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBatchTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBatchTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchTaskRequest, ShowBatchTaskResponse> showBatchTask = genForshowBatchTask();

    private static HttpRequestDef<ShowBatchTaskRequest, ShowBatchTaskResponse> genForshowBatchTask() {
        // basic
        HttpRequestDef.Builder<ShowBatchTaskRequest, ShowBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchTaskRequest.class, ShowBatchTaskResponse.class)
                .withUri("/v5/iot/{project_id}/batchtasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBatchTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowBatchTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBatchTaskRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowBatchTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBatchTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> deleteBatchTaskFile = genFordeleteBatchTaskFile();

    private static HttpRequestDef<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> genFordeleteBatchTaskFile() {
        // basic
        HttpRequestDef.Builder<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBatchTaskFileRequest.class, DeleteBatchTaskFileResponse.class)
                .withUri("/v5/iot/{project_id}/batchtask-files/{file_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBatchTaskFileRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBatchTaskFileRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBatchTaskFileResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> listBatchTaskFiles = genForlistBatchTaskFiles();

    private static HttpRequestDef<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> genForlistBatchTaskFiles() {
        // basic
        HttpRequestDef.Builder<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchTaskFilesRequest.class, ListBatchTaskFilesResponse.class)
                .withUri("/v5/iot/{project_id}/batchtask-files")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBatchTaskFilesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddCertificateRequest, AddCertificateResponse> addCertificate = genForaddCertificate();

    private static HttpRequestDef<AddCertificateRequest, AddCertificateResponse> genForaddCertificate() {
        // basic
        HttpRequestDef.Builder<AddCertificateRequest, AddCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCertificateRequest.class, AddCertificateResponse.class)
                .withUri("/v5/iot/{project_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddCertificateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateCertificateDTO.class,
            f -> f.withMarshaller(AddCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckCertificateRequest, CheckCertificateResponse> checkCertificate = genForcheckCertificate();

    private static HttpRequestDef<CheckCertificateRequest, CheckCertificateResponse> genForcheckCertificate() {
        // basic
        HttpRequestDef.Builder<CheckCertificateRequest, CheckCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckCertificateRequest.class, CheckCertificateResponse.class)
                .withUri("/v5/iot/{project_id}/certificates/{certificate_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );
        builder.withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckCertificateRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckCertificateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VerifyCertificateDTO.class,
            f -> f.withMarshaller(CheckCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckCertificateResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate = genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withUri("/v5/iot/{project_id}/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCertificateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCertificateResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates = genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withUri("/v5/iot/{project_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCertificatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommandRequest, CreateCommandResponse> createCommand = genForcreateCommand();

    private static HttpRequestDef<CreateCommandRequest, CreateCommandResponse> genForcreateCommand() {
        // basic
        HttpRequestDef.Builder<CreateCommandRequest, CreateCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommandRequest.class, CreateCommandResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/commands")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateCommandRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeviceCommandRequest.class,
            f -> f.withMarshaller(CreateCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceGroupRequest, AddDeviceGroupResponse> addDeviceGroup = genForaddDeviceGroup();

    private static HttpRequestDef<AddDeviceGroupRequest, AddDeviceGroupResponse> genForaddDeviceGroup() {
        // basic
        HttpRequestDef.Builder<AddDeviceGroupRequest, AddDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceGroupRequest.class, AddDeviceGroupResponse.class)
                .withUri("/v5/iot/{project_id}/device-group")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddDeviceGroupDTO.class,
            f -> f.withMarshaller(AddDeviceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroup = genForcreateOrDeleteDeviceInGroup();

    private static HttpRequestDef<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> genForcreateOrDeleteDeviceInGroup() {
        // basic
        HttpRequestDef.Builder<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrDeleteDeviceInGroupRequest.class, CreateOrDeleteDeviceInGroupResponse.class)
                .withUri("/v5/iot/{project_id}/device-group/{group_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroup = genFordeleteDeviceGroup();

    private static HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> genFordeleteDeviceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceGroupRequest.class, DeleteDeviceGroupResponse.class)
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceGroupResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceGroupsRequest, ListDeviceGroupsResponse> listDeviceGroups = genForlistDeviceGroups();

    private static HttpRequestDef<ListDeviceGroupsRequest, ListDeviceGroupsResponse> genForlistDeviceGroups() {
        // basic
        HttpRequestDef.Builder<ListDeviceGroupsRequest, ListDeviceGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceGroupsRequest.class, ListDeviceGroupsResponse.class)
                .withUri("/v5/iot/{project_id}/device-group")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDeviceGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDeviceGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDeviceGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("last_modified_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDeviceGroupsRequest::getLastModifiedTime, (req, v) -> {
                req.setLastModifiedTime(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDeviceGroupsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDeviceGroupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroup = genForshowDeviceGroup();

    private static HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> genForshowDeviceGroup() {
        // basic
        HttpRequestDef.Builder<ShowDeviceGroupRequest, ShowDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceGroupRequest.class, ShowDeviceGroupResponse.class)
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroup = genForshowDevicesInGroup();

    private static HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> genForshowDevicesInGroup() {
        // basic
        HttpRequestDef.Builder<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDevicesInGroupRequest.class, ShowDevicesInGroupResponse.class)
                .withUri("/v5/iot/{project_id}/device-group/{group_id}/devices")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroup = genForupdateDeviceGroup();

    private static HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> genForupdateDeviceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceGroupRequest.class, UpdateDeviceGroupResponse.class)
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDeviceGroupDTO.class,
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceRequest, AddDeviceResponse> addDevice = genForaddDevice();

    private static HttpRequestDef<AddDeviceRequest, AddDeviceResponse> genForaddDevice() {
        // basic
        HttpRequestDef.Builder<AddDeviceRequest, AddDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceRequest.class, AddDeviceResponse.class)
                .withUri("/v5/iot/{project_id}/devices")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddDevice.class,
            f -> f.withMarshaller(AddDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> deleteDevice = genFordeleteDevice();

    private static HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> genFordeleteDevice() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceRequest, DeleteDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceRequest.class, DeleteDeviceResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<FreezeDeviceRequest, FreezeDeviceResponse> freezeDevice = genForfreezeDevice();

    private static HttpRequestDef<FreezeDeviceRequest, FreezeDeviceResponse> genForfreezeDevice() {
        // basic
        HttpRequestDef.Builder<FreezeDeviceRequest, FreezeDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, FreezeDeviceRequest.class, FreezeDeviceResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/freeze")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(FreezeDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(FreezeDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(FreezeDeviceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForlistDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForlistDevices() {
        // basic
        HttpRequestDef.Builder<ListDevicesRequest, ListDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesRequest.class, ListDevicesResponse.class)
                .withUri("/v5/iot/{project_id}/devices")
                .withContentType("application/json");

        // requests
        builder.withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            })
        );
        builder.withRequestField("is_cascade_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListDevicesRequest::getIsCascadeQuery, (req, v) -> {
                req.setIsCascadeQuery(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getDeviceName, (req, v) -> {
                req.setDeviceName(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDevicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDevicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetDeviceSecretRequest, ResetDeviceSecretResponse> resetDeviceSecret = genForresetDeviceSecret();

    private static HttpRequestDef<ResetDeviceSecretRequest, ResetDeviceSecretResponse> genForresetDeviceSecret() {
        // basic
        HttpRequestDef.Builder<ResetDeviceSecretRequest, ResetDeviceSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetDeviceSecretRequest.class, ResetDeviceSecretResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetDeviceSecretRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetDeviceSecretRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetDeviceSecretRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetDeviceSecret.class,
            f -> f.withMarshaller(ResetDeviceSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> showDevice = genForshowDevice();

    private static HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> genForshowDevice() {
        // basic
        HttpRequestDef.Builder<ShowDeviceRequest, ShowDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceRequest.class, ShowDeviceResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezeDeviceRequest, UnfreezeDeviceResponse> unfreezeDevice = genForunfreezeDevice();

    private static HttpRequestDef<UnfreezeDeviceRequest, UnfreezeDeviceResponse> genForunfreezeDevice() {
        // basic
        HttpRequestDef.Builder<UnfreezeDeviceRequest, UnfreezeDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnfreezeDeviceRequest.class, UnfreezeDeviceResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/unfreeze")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UnfreezeDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UnfreezeDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UnfreezeDeviceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForupdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForupdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDevice.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceShadowRequest, ShowDeviceShadowResponse> showDeviceShadow = genForshowDeviceShadow();

    private static HttpRequestDef<ShowDeviceShadowRequest, ShowDeviceShadowResponse> genForshowDeviceShadow() {
        // basic
        HttpRequestDef.Builder<ShowDeviceShadowRequest, ShowDeviceShadowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceShadowRequest.class, ShowDeviceShadowResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceShadowRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceShadowRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredData = genForupdateDeviceShadowDesiredData();

    private static HttpRequestDef<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> genForupdateDeviceShadowDesiredData() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceShadowDesiredDataRequest.class, UpdateDeviceShadowDesiredDataResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDesireds.class,
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessageRequest, CreateMessageResponse> createMessage = genForcreateMessage();

    private static HttpRequestDef<CreateMessageRequest, CreateMessageResponse> genForcreateMessage() {
        // basic
        HttpRequestDef.Builder<CreateMessageRequest, CreateMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMessageRequest.class, CreateMessageResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateMessageRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeviceMessageRequest.class,
            f -> f.withMarshaller(CreateMessageRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceMessagesRequest, ListDeviceMessagesResponse> listDeviceMessages = genForlistDeviceMessages();

    private static HttpRequestDef<ListDeviceMessagesRequest, ListDeviceMessagesResponse> genForlistDeviceMessages() {
        // basic
        HttpRequestDef.Builder<ListDeviceMessagesRequest, ListDeviceMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceMessagesRequest.class, ListDeviceMessagesResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDeviceMessagesRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDeviceMessagesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceMessageRequest, ShowDeviceMessageResponse> showDeviceMessage = genForshowDeviceMessage();

    private static HttpRequestDef<ShowDeviceMessageRequest, ShowDeviceMessageResponse> genForshowDeviceMessage() {
        // basic
        HttpRequestDef.Builder<ShowDeviceMessageRequest, ShowDeviceMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceMessageRequest.class, ShowDeviceMessageResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages/{message_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceMessageRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("message_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceMessageRequest::getMessageId, (req, v) -> {
                req.setMessageId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductRequest, CreateProductResponse> createProduct = genForcreateProduct();

    private static HttpRequestDef<CreateProductRequest, CreateProductResponse> genForcreateProduct() {
        // basic
        HttpRequestDef.Builder<CreateProductRequest, CreateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductRequest.class, CreateProductResponse.class)
                .withUri("/v5/iot/{project_id}/products")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddProduct.class,
            f -> f.withMarshaller(CreateProductRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductRequest, DeleteProductResponse> deleteProduct = genFordeleteProduct();

    private static HttpRequestDef<DeleteProductRequest, DeleteProductResponse> genFordeleteProduct() {
        // basic
        HttpRequestDef.Builder<DeleteProductRequest, DeleteProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductRequest.class, DeleteProductResponse.class)
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteProductRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteProductResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForlistProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForlistProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withUri("/v5/iot/{project_id}/products")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductRequest, ShowProductResponse> showProduct = genForshowProduct();

    private static HttpRequestDef<ShowProductRequest, ShowProductResponse> genForshowProduct() {
        // basic
        HttpRequestDef.Builder<ShowProductRequest, ShowProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductRequest.class, ShowProductResponse.class)
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowProductRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductRequest, UpdateProductResponse> updateProduct = genForupdateProduct();

    private static HttpRequestDef<UpdateProductRequest, UpdateProductResponse> genForupdateProduct() {
        // basic
        HttpRequestDef.Builder<UpdateProductRequest, UpdateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductRequest.class, UpdateProductResponse.class)
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateProduct.class,
            f -> f.withMarshaller(UpdateProductRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> listProperties = genForlistProperties();

    private static HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> genForlistProperties() {
        // basic
        HttpRequestDef.Builder<ListPropertiesRequest, ListPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPropertiesRequest.class, ListPropertiesResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/properties")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPropertiesRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPropertiesRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPropertiesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePropertiesRequest, UpdatePropertiesResponse> updateProperties = genForupdateProperties();

    private static HttpRequestDef<UpdatePropertiesRequest, UpdatePropertiesResponse> genForupdateProperties() {
        // basic
        HttpRequestDef.Builder<UpdatePropertiesRequest, UpdatePropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePropertiesRequest.class, UpdatePropertiesResponse.class)
                .withUri("/v5/iot/{project_id}/devices/{device_id}/properties")
                .withContentType("application/json");

        // requests
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePropertiesRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePropertiesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DevicePropertiesRequest.class,
            f -> f.withMarshaller(UpdatePropertiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutingRuleRequest, CreateRoutingRuleResponse> createRoutingRule = genForcreateRoutingRule();

    private static HttpRequestDef<CreateRoutingRuleRequest, CreateRoutingRuleResponse> genForcreateRoutingRule() {
        // basic
        HttpRequestDef.Builder<CreateRoutingRuleRequest, CreateRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoutingRuleRequest.class, CreateRoutingRuleResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRoutingRuleRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRoutingRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddRuleReq.class,
            f -> f.withMarshaller(CreateRoutingRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleActionRequest, CreateRuleActionResponse> createRuleAction = genForcreateRuleAction();

    private static HttpRequestDef<CreateRuleActionRequest, CreateRuleActionResponse> genForcreateRuleAction() {
        // basic
        HttpRequestDef.Builder<CreateRuleActionRequest, CreateRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleActionRequest.class, CreateRuleActionResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/actions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRuleActionRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRuleActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddActionReq.class,
            f -> f.withMarshaller(CreateRuleActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> deleteRoutingRule = genFordeleteRoutingRule();

    private static HttpRequestDef<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> genFordeleteRoutingRule() {
        // basic
        HttpRequestDef.Builder<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRoutingRuleRequest.class, DeleteRoutingRuleResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRoutingRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRoutingRuleRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRoutingRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRoutingRuleResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleActionRequest, DeleteRuleActionResponse> deleteRuleAction = genFordeleteRuleAction();

    private static HttpRequestDef<DeleteRuleActionRequest, DeleteRuleActionResponse> genFordeleteRuleAction() {
        // basic
        HttpRequestDef.Builder<DeleteRuleActionRequest, DeleteRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleActionRequest.class, DeleteRuleActionResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRuleActionRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleActionRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleActionResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutingRulesRequest, ListRoutingRulesResponse> listRoutingRules = genForlistRoutingRules();

    private static HttpRequestDef<ListRoutingRulesRequest, ListRoutingRulesResponse> genForlistRoutingRules() {
        // basic
        HttpRequestDef.Builder<ListRoutingRulesRequest, ListRoutingRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoutingRulesRequest.class, ListRoutingRulesResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getResource, (req, v) -> {
                req.setResource(v);
            })
        );
        builder.withRequestField("event",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getEvent, (req, v) -> {
                req.setEvent(v);
            })
        );
        builder.withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getRuleName, (req, v) -> {
                req.setRuleName(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRoutingRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleActionsRequest, ListRuleActionsResponse> listRuleActions = genForlistRuleActions();

    private static HttpRequestDef<ListRuleActionsRequest, ListRuleActionsResponse> genForlistRuleActions() {
        // basic
        HttpRequestDef.Builder<ListRuleActionsRequest, ListRuleActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleActionsRequest.class, ListRuleActionsResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/actions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("channel",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getChannel, (req, v) -> {
                req.setChannel(v);
            })
        );
        builder.withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRuleActionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoutingRuleRequest, ShowRoutingRuleResponse> showRoutingRule = genForshowRoutingRule();

    private static HttpRequestDef<ShowRoutingRuleRequest, ShowRoutingRuleResponse> genForshowRoutingRule() {
        // basic
        HttpRequestDef.Builder<ShowRoutingRuleRequest, ShowRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRoutingRuleRequest.class, ShowRoutingRuleResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRoutingRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRoutingRuleRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRoutingRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleActionRequest, ShowRuleActionResponse> showRuleAction = genForshowRuleAction();

    private static HttpRequestDef<ShowRuleActionRequest, ShowRuleActionResponse> genForshowRuleAction() {
        // basic
        HttpRequestDef.Builder<ShowRuleActionRequest, ShowRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleActionRequest.class, ShowRuleActionResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRuleActionRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRuleActionRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRuleActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> updateRoutingRule = genForupdateRoutingRule();

    private static HttpRequestDef<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> genForupdateRoutingRule() {
        // basic
        HttpRequestDef.Builder<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRoutingRuleRequest.class, UpdateRoutingRuleResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateRuleReq.class,
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleActionRequest, UpdateRuleActionResponse> updateRuleAction = genForupdateRuleAction();

    private static HttpRequestDef<UpdateRuleActionRequest, UpdateRuleActionResponse> genForupdateRuleAction() {
        // basic
        HttpRequestDef.Builder<UpdateRuleActionRequest, UpdateRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleActionRequest.class, UpdateRuleActionResponse.class)
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRuleActionRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRuleActionRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRuleActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateActionReq.class,
            f -> f.withMarshaller(UpdateRuleActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeRuleStatusRequest, ChangeRuleStatusResponse> changeRuleStatus = genForchangeRuleStatus();

    private static HttpRequestDef<ChangeRuleStatusRequest, ChangeRuleStatusResponse> genForchangeRuleStatus() {
        // basic
        HttpRequestDef.Builder<ChangeRuleStatusRequest, ChangeRuleStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeRuleStatusRequest.class, ChangeRuleStatusResponse.class)
                .withUri("/v5/iot/{project_id}/rules/{rule_id}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeRuleStatusRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeRuleStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RuleStatus.class,
            f -> f.withMarshaller(ChangeRuleStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForcreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForcreateRule() {
        // basic
        HttpRequestDef.Builder<CreateRuleRequest, CreateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleRequest.class, CreateRuleResponse.class)
                .withUri("/v5/iot/{project_id}/rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            Rule.class,
            f -> f.withMarshaller(CreateRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genFordeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genFordeleteRule() {
        // basic
        HttpRequestDef.Builder<DeleteRuleRequest, DeleteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleRequest.class, DeleteRuleResponse.class)
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForlistRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForlistRules() {
        // basic
        HttpRequestDef.Builder<ListRulesRequest, ListRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRulesRequest.class, ListRulesResponse.class)
                .withUri("/v5/iot/{project_id}/rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRulesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleRequest, ShowRuleResponse> showRule = genForshowRule();

    private static HttpRequestDef<ShowRuleRequest, ShowRuleResponse> genForshowRule() {
        // basic
        HttpRequestDef.Builder<ShowRuleRequest, ShowRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleRequest.class, ShowRuleResponse.class)
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> updateRule = genForupdateRule();

    private static HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> genForupdateRule() {
        // basic
        HttpRequestDef.Builder<UpdateRuleRequest, UpdateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleRequest.class, UpdateRuleResponse.class)
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            Rule.class,
            f -> f.withMarshaller(UpdateRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubscriptionRequest, CreateSubscriptionResponse> createSubscription = genForcreateSubscription();

    private static HttpRequestDef<CreateSubscriptionRequest, CreateSubscriptionResponse> genForcreateSubscription() {
        // basic
        HttpRequestDef.Builder<CreateSubscriptionRequest, CreateSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubscriptionRequest.class, CreateSubscriptionResponse.class)
                .withUri("/v5/iot/{project_id}/subscriptions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSubscriptionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSubReq.class,
            f -> f.withMarshaller(CreateSubscriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubscriptionRequest, DeleteSubscriptionResponse> deleteSubscription = genFordeleteSubscription();

    private static HttpRequestDef<DeleteSubscriptionRequest, DeleteSubscriptionResponse> genFordeleteSubscription() {
        // basic
        HttpRequestDef.Builder<DeleteSubscriptionRequest, DeleteSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubscriptionRequest.class, DeleteSubscriptionResponse.class)
                .withUri("/v5/iot/{project_id}/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSubscriptionRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSubscriptionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSubscriptionResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptions = genForlistSubscriptions();

    private static HttpRequestDef<ListSubscriptionsRequest, ListSubscriptionsResponse> genForlistSubscriptions() {
        // basic
        HttpRequestDef.Builder<ListSubscriptionsRequest, ListSubscriptionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubscriptionsRequest.class, ListSubscriptionsResponse.class)
                .withUri("/v5/iot/{project_id}/subscriptions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getResource, (req, v) -> {
                req.setResource(v);
            })
        );
        builder.withRequestField("event",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getEvent, (req, v) -> {
                req.setEvent(v);
            })
        );
        builder.withRequestField("callbackurl",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getCallbackurl, (req, v) -> {
                req.setCallbackurl(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("channel",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getChannel, (req, v) -> {
                req.setChannel(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubscriptionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubscriptionRequest, ShowSubscriptionResponse> showSubscription = genForshowSubscription();

    private static HttpRequestDef<ShowSubscriptionRequest, ShowSubscriptionResponse> genForshowSubscription() {
        // basic
        HttpRequestDef.Builder<ShowSubscriptionRequest, ShowSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubscriptionRequest.class, ShowSubscriptionResponse.class)
                .withUri("/v5/iot/{project_id}/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSubscriptionRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSubscriptionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscription = genForupdateSubscription();

    private static HttpRequestDef<UpdateSubscriptionRequest, UpdateSubscriptionResponse> genForupdateSubscription() {
        // basic
        HttpRequestDef.Builder<UpdateSubscriptionRequest, UpdateSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubscriptionRequest.class, UpdateSubscriptionResponse.class)
                .withUri("/v5/iot/{project_id}/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSubscriptionRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateSubscriptionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSubReq.class,
            f -> f.withMarshaller(UpdateSubscriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTags = genForlistResourcesByTags();

    private static HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> genForlistResourcesByTags() {
        // basic
        HttpRequestDef.Builder<ListResourcesByTagsRequest, ListResourcesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourcesByTagsRequest.class, ListResourcesByTagsResponse.class)
                .withUri("/v5/iot/{project_id}/tags/query-resources")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListResourcesByTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourcesByTagsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListResourcesByTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourcesByTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryResourceByTagsDTO.class,
            f -> f.withMarshaller(ListResourcesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagDeviceRequest, TagDeviceResponse> tagDevice = genFortagDevice();

    private static HttpRequestDef<TagDeviceRequest, TagDeviceResponse> genFortagDevice() {
        // basic
        HttpRequestDef.Builder<TagDeviceRequest, TagDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagDeviceRequest.class, TagDeviceResponse.class)
                .withUri("/v5/iot/{project_id}/tags/bind-resource")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TagDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BindTagsDTO.class,
            f -> f.withMarshaller(TagDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TagDeviceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<UntagDeviceRequest, UntagDeviceResponse> untagDevice = genForuntagDevice();

    private static HttpRequestDef<UntagDeviceRequest, UntagDeviceResponse> genForuntagDevice() {
        // basic
        HttpRequestDef.Builder<UntagDeviceRequest, UntagDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UntagDeviceRequest.class, UntagDeviceResponse.class)
                .withUri("/v5/iot/{project_id}/tags/unbind-resource")
                .withContentType("application/json");

        // requests
        builder.withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UntagDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UnbindTagsDTO.class,
            f -> f.withMarshaller(UntagDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UntagDeviceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

}
