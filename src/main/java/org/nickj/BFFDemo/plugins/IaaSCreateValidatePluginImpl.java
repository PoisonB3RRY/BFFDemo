package org.nickj.BFFDemo.plugins;

import org.nickj.BFFDemo.Enums.IaaSPluginType;
import org.springframework.stereotype.Component;

@Component
public class IaaSCreateValidatePluginImpl implements  IaaSCreateValidatePlugin{
    @Override
    public void validate() {
        System.out.println("ECS Validate");
    }

    @Override
    public boolean supports(IaaSPluginType iaaSPluginType) {
        return iaaSPluginType.equals(IaaSPluginType.IAAS_ECS_CREATE_VALIDATE);
    }
}
