package com.project.spEL.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="com.project.spEL")
@PropertySource("classpath:info.properties")
public class ConfigClass {

}
