package org.nickj.BFFDemo.Bean;

import org.junit.jupiter.api.Test;
import org.nickj.BFFDemo.Enums.IaaSPluginType;
import org.nickj.BFFDemo.plugins.IaaSCreateValidatePlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.plugin.core.PluginRegistry;

@SpringBootTest
public class PluginTest {

    @Autowired
    PluginRegistry<IaaSCreateValidatePlugin,IaaSPluginType> pluginRegistry;
    
    @Test
    public void testCode(){
        IaaSCreateValidatePlugin iaaSCreateValidatePlugin = pluginRegistry.getRequiredPluginFor(IaaSPluginType.IAAS_ECS_CREATE_VALIDATE);
        iaaSCreateValidatePlugin.validate();
    }
}
