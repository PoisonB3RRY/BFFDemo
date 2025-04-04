package org.nickj.BFFDemo.Config;

import org.nickj.BFFDemo.plugins.IaaSCreateValidatePlugin;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.plugin.core.config.EnablePluginRegistries;
import org.springframework.stereotype.Component;

@Component
@EnablePluginRegistries(value = IaaSCreateValidatePlugin.class)
@ComponentScan(basePackages = "org.nickj.BFFDemo.plugins")
public class PluginsConfig {
}
