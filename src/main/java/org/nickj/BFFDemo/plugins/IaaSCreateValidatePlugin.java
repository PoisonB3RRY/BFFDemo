package org.nickj.BFFDemo.plugins;

import org.nickj.BFFDemo.Enums.IaaSPluginType;
import org.springframework.plugin.core.Plugin;

public interface IaaSCreateValidatePlugin extends Plugin<IaaSPluginType> {

    void validate();
}
