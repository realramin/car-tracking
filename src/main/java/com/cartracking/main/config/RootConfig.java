package com.cartracking.main.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={
        "com.cartracking.main",
},
excludeFilters={
        @ComponentScan.Filter(type= FilterType.ANNOTATION, value=EnableWebMvc.class)
})
@EnableCaching
public class RootConfig {
}
