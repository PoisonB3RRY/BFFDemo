package org.nickj.BFFDemo.Enums;

public enum IaaSPluginType {

    IAAS_ECS_CREATE_VALIDATE("XCVirtualMachine", "create", "validate"),
    IAAS_ECS_CREATE_ASSETGROUP("XCVirtualMachine", "create", "combineAssetGroup");

    private String serviceType;

    private String operateType;

    private String taskType;

    IaaSPluginType(String serviceType, String operateType, String taskType){
        this.serviceType = serviceType;
        this.operateType = operateType;
        this.taskType = taskType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getOperateType() {
        return operateType;
    }

    public String getTaskType() {
        return taskType;
    }
}
