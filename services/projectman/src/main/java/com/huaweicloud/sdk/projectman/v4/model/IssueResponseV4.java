package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.CreateIssueResponseV4ParentIssue;
import com.huaweicloud.sdk.projectman.v4.model.CustomField;
import com.huaweicloud.sdk.projectman.v4.model.IssueItemSFV4Domain;
import com.huaweicloud.sdk.projectman.v4.model.IssueItemSFV4Iteration;
import com.huaweicloud.sdk.projectman.v4.model.IssueItemSFV4Module;
import com.huaweicloud.sdk.projectman.v4.model.IssueItemSFV4Priority;
import com.huaweicloud.sdk.projectman.v4.model.IssueItemSFV4Severity;
import com.huaweicloud.sdk.projectman.v4.model.IssueItemSFV4Status;
import com.huaweicloud.sdk.projectman.v4.model.IssueItemSFV4Tracker;
import com.huaweicloud.sdk.projectman.v4.model.IssueProjectResponseV4;
import com.huaweicloud.sdk.projectman.v4.model.IssueUser;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 工作项属性
 */
public class IssueResponseV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="actual_work_hours")
    
    private Double actualWorkHours;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assigned_cc_user")
    
    private List<IssueUser> assignedCcUser = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assigned_user")
    
    private IssueUser assignedUser = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    private IssueUser creator = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="custom_fields")
    
    private List<CustomField> customFields = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="developer")
    
    private IssueUser developer = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private IssueItemSFV4Domain domain = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="done_ratio")
    
    private Integer doneRatio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expected_work_hours")
    
    private Double expectedWorkHours;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iteration")
    
    private IssueItemSFV4Iteration iteration = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module")
    
    private IssueItemSFV4Module module = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_issue")
    
    private CreateIssueResponseV4ParentIssue parentIssue = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority")
    
    private IssueItemSFV4Priority priority = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project")
    
    private IssueProjectResponseV4 project = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="severity")
    
    private IssueItemSFV4Severity severity = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private IssueItemSFV4Status status = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker")
    
    private IssueItemSFV4Tracker tracker = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_time")
    
    private String updatedTime;

    public IssueResponseV4 withActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
        return this;
    }

    


    /**
     * 实际工时
     * @return actualWorkHours
     */
    public Double getActualWorkHours() {
        return actualWorkHours;
    }

    public void setActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
    }

    public IssueResponseV4 withAssignedCcUser(List<IssueUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
        return this;
    }

    
    public IssueResponseV4 addAssignedCcUserItem(IssueUser assignedCcUserItem) {
        if (this.assignedCcUser == null) {
            this.assignedCcUser = new ArrayList<>();
        }
        this.assignedCcUser.add(assignedCcUserItem);
        return this;
    }

    public IssueResponseV4 withAssignedCcUser(Consumer<List<IssueUser>> assignedCcUserSetter) {
        if(this.assignedCcUser == null ){
            this.assignedCcUser = new ArrayList<>();
        }
        assignedCcUserSetter.accept(this.assignedCcUser);
        return this;
    }

    /**
     * 抄送人
     * @return assignedCcUser
     */
    public List<IssueUser> getAssignedCcUser() {
        return assignedCcUser;
    }

    public void setAssignedCcUser(List<IssueUser> assignedCcUser) {
        this.assignedCcUser = assignedCcUser;
    }

    public IssueResponseV4 withAssignedUser(IssueUser assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    public IssueResponseV4 withAssignedUser(Consumer<IssueUser> assignedUserSetter) {
        if(this.assignedUser == null ){
            this.assignedUser = new IssueUser();
            assignedUserSetter.accept(this.assignedUser);
        }
        
        return this;
    }


    /**
     * Get assignedUser
     * @return assignedUser
     */
    public IssueUser getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(IssueUser assignedUser) {
        this.assignedUser = assignedUser;
    }

    public IssueResponseV4 withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 开始时间，年-月-日
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public IssueResponseV4 withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 更新时间 年-月-日 时:分:秒
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public IssueResponseV4 withCreator(IssueUser creator) {
        this.creator = creator;
        return this;
    }

    public IssueResponseV4 withCreator(Consumer<IssueUser> creatorSetter) {
        if(this.creator == null ){
            this.creator = new IssueUser();
            creatorSetter.accept(this.creator);
        }
        
        return this;
    }


    /**
     * Get creator
     * @return creator
     */
    public IssueUser getCreator() {
        return creator;
    }

    public void setCreator(IssueUser creator) {
        this.creator = creator;
    }

    public IssueResponseV4 withCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
        return this;
    }

    
    public IssueResponseV4 addCustomFieldsItem(CustomField customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public IssueResponseV4 withCustomFields(Consumer<List<CustomField>> customFieldsSetter) {
        if(this.customFields == null ){
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * 自定义属性值
     * @return customFields
     */
    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public IssueResponseV4 withDeveloper(IssueUser developer) {
        this.developer = developer;
        return this;
    }

    public IssueResponseV4 withDeveloper(Consumer<IssueUser> developerSetter) {
        if(this.developer == null ){
            this.developer = new IssueUser();
            developerSetter.accept(this.developer);
        }
        
        return this;
    }


    /**
     * Get developer
     * @return developer
     */
    public IssueUser getDeveloper() {
        return developer;
    }

    public void setDeveloper(IssueUser developer) {
        this.developer = developer;
    }

    public IssueResponseV4 withDomain(IssueItemSFV4Domain domain) {
        this.domain = domain;
        return this;
    }

    public IssueResponseV4 withDomain(Consumer<IssueItemSFV4Domain> domainSetter) {
        if(this.domain == null ){
            this.domain = new IssueItemSFV4Domain();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public IssueItemSFV4Domain getDomain() {
        return domain;
    }

    public void setDomain(IssueItemSFV4Domain domain) {
        this.domain = domain;
    }

    public IssueResponseV4 withDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
        return this;
    }

    


    /**
     * 工作项进度值
     * @return doneRatio
     */
    public Integer getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    public IssueResponseV4 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间，年-月-日
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public IssueResponseV4 withExpectedWorkHours(Double expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
        return this;
    }

    


    /**
     * 预计工时
     * @return expectedWorkHours
     */
    public Double getExpectedWorkHours() {
        return expectedWorkHours;
    }

    public void setExpectedWorkHours(Double expectedWorkHours) {
        this.expectedWorkHours = expectedWorkHours;
    }

    public IssueResponseV4 withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 工作项项id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IssueResponseV4 withIteration(IssueItemSFV4Iteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public IssueResponseV4 withIteration(Consumer<IssueItemSFV4Iteration> iterationSetter) {
        if(this.iteration == null ){
            this.iteration = new IssueItemSFV4Iteration();
            iterationSetter.accept(this.iteration);
        }
        
        return this;
    }


    /**
     * Get iteration
     * @return iteration
     */
    public IssueItemSFV4Iteration getIteration() {
        return iteration;
    }

    public void setIteration(IssueItemSFV4Iteration iteration) {
        this.iteration = iteration;
    }

    public IssueResponseV4 withModule(IssueItemSFV4Module module) {
        this.module = module;
        return this;
    }

    public IssueResponseV4 withModule(Consumer<IssueItemSFV4Module> moduleSetter) {
        if(this.module == null ){
            this.module = new IssueItemSFV4Module();
            moduleSetter.accept(this.module);
        }
        
        return this;
    }


    /**
     * Get module
     * @return module
     */
    public IssueItemSFV4Module getModule() {
        return module;
    }

    public void setModule(IssueItemSFV4Module module) {
        this.module = module;
    }

    public IssueResponseV4 withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 标题
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueResponseV4 withParentIssue(CreateIssueResponseV4ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
        return this;
    }

    public IssueResponseV4 withParentIssue(Consumer<CreateIssueResponseV4ParentIssue> parentIssueSetter) {
        if(this.parentIssue == null ){
            this.parentIssue = new CreateIssueResponseV4ParentIssue();
            parentIssueSetter.accept(this.parentIssue);
        }
        
        return this;
    }


    /**
     * Get parentIssue
     * @return parentIssue
     */
    public CreateIssueResponseV4ParentIssue getParentIssue() {
        return parentIssue;
    }

    public void setParentIssue(CreateIssueResponseV4ParentIssue parentIssue) {
        this.parentIssue = parentIssue;
    }

    public IssueResponseV4 withPriority(IssueItemSFV4Priority priority) {
        this.priority = priority;
        return this;
    }

    public IssueResponseV4 withPriority(Consumer<IssueItemSFV4Priority> prioritySetter) {
        if(this.priority == null ){
            this.priority = new IssueItemSFV4Priority();
            prioritySetter.accept(this.priority);
        }
        
        return this;
    }


    /**
     * Get priority
     * @return priority
     */
    public IssueItemSFV4Priority getPriority() {
        return priority;
    }

    public void setPriority(IssueItemSFV4Priority priority) {
        this.priority = priority;
    }

    public IssueResponseV4 withProject(IssueProjectResponseV4 project) {
        this.project = project;
        return this;
    }

    public IssueResponseV4 withProject(Consumer<IssueProjectResponseV4> projectSetter) {
        if(this.project == null ){
            this.project = new IssueProjectResponseV4();
            projectSetter.accept(this.project);
        }
        
        return this;
    }


    /**
     * Get project
     * @return project
     */
    public IssueProjectResponseV4 getProject() {
        return project;
    }

    public void setProject(IssueProjectResponseV4 project) {
        this.project = project;
    }

    public IssueResponseV4 withSeverity(IssueItemSFV4Severity severity) {
        this.severity = severity;
        return this;
    }

    public IssueResponseV4 withSeverity(Consumer<IssueItemSFV4Severity> severitySetter) {
        if(this.severity == null ){
            this.severity = new IssueItemSFV4Severity();
            severitySetter.accept(this.severity);
        }
        
        return this;
    }


    /**
     * Get severity
     * @return severity
     */
    public IssueItemSFV4Severity getSeverity() {
        return severity;
    }

    public void setSeverity(IssueItemSFV4Severity severity) {
        this.severity = severity;
    }

    public IssueResponseV4 withStatus(IssueItemSFV4Status status) {
        this.status = status;
        return this;
    }

    public IssueResponseV4 withStatus(Consumer<IssueItemSFV4Status> statusSetter) {
        if(this.status == null ){
            this.status = new IssueItemSFV4Status();
            statusSetter.accept(this.status);
        }
        
        return this;
    }


    /**
     * Get status
     * @return status
     */
    public IssueItemSFV4Status getStatus() {
        return status;
    }

    public void setStatus(IssueItemSFV4Status status) {
        this.status = status;
    }

    public IssueResponseV4 withTracker(IssueItemSFV4Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public IssueResponseV4 withTracker(Consumer<IssueItemSFV4Tracker> trackerSetter) {
        if(this.tracker == null ){
            this.tracker = new IssueItemSFV4Tracker();
            trackerSetter.accept(this.tracker);
        }
        
        return this;
    }


    /**
     * Get tracker
     * @return tracker
     */
    public IssueItemSFV4Tracker getTracker() {
        return tracker;
    }

    public void setTracker(IssueItemSFV4Tracker tracker) {
        this.tracker = tracker;
    }

    public IssueResponseV4 withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    


    /**
     * 更新时间 年-月-日 时:分:秒
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueResponseV4 issueResponseV4 = (IssueResponseV4) o;
        return Objects.equals(this.actualWorkHours, issueResponseV4.actualWorkHours) &&
            Objects.equals(this.assignedCcUser, issueResponseV4.assignedCcUser) &&
            Objects.equals(this.assignedUser, issueResponseV4.assignedUser) &&
            Objects.equals(this.beginTime, issueResponseV4.beginTime) &&
            Objects.equals(this.createdTime, issueResponseV4.createdTime) &&
            Objects.equals(this.creator, issueResponseV4.creator) &&
            Objects.equals(this.customFields, issueResponseV4.customFields) &&
            Objects.equals(this.developer, issueResponseV4.developer) &&
            Objects.equals(this.domain, issueResponseV4.domain) &&
            Objects.equals(this.doneRatio, issueResponseV4.doneRatio) &&
            Objects.equals(this.endTime, issueResponseV4.endTime) &&
            Objects.equals(this.expectedWorkHours, issueResponseV4.expectedWorkHours) &&
            Objects.equals(this.id, issueResponseV4.id) &&
            Objects.equals(this.iteration, issueResponseV4.iteration) &&
            Objects.equals(this.module, issueResponseV4.module) &&
            Objects.equals(this.name, issueResponseV4.name) &&
            Objects.equals(this.parentIssue, issueResponseV4.parentIssue) &&
            Objects.equals(this.priority, issueResponseV4.priority) &&
            Objects.equals(this.project, issueResponseV4.project) &&
            Objects.equals(this.severity, issueResponseV4.severity) &&
            Objects.equals(this.status, issueResponseV4.status) &&
            Objects.equals(this.tracker, issueResponseV4.tracker) &&
            Objects.equals(this.updatedTime, issueResponseV4.updatedTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actualWorkHours, assignedCcUser, assignedUser, beginTime, createdTime, creator, customFields, developer, domain, doneRatio, endTime, expectedWorkHours, id, iteration, module, name, parentIssue, priority, project, severity, status, tracker, updatedTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueResponseV4 {\n");
        sb.append("    actualWorkHours: ").append(toIndentedString(actualWorkHours)).append("\n");
        sb.append("    assignedCcUser: ").append(toIndentedString(assignedCcUser)).append("\n");
        sb.append("    assignedUser: ").append(toIndentedString(assignedUser)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    doneRatio: ").append(toIndentedString(doneRatio)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expectedWorkHours: ").append(toIndentedString(expectedWorkHours)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentIssue: ").append(toIndentedString(parentIssue)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

