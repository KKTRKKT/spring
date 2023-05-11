package me.kktrkkt.spring.ioc_container.application_context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class ComponentScanConfig {

}
