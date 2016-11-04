package com.edu.agh.titles;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.logging.Logger;

/**
 * Created by asiab on 2016-11-03.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class TitleConfiguration extends WebMvcConfigurerAdapter {
    protected Logger logger;

    public TitleConfiguration() {
        logger = Logger.getLogger(getClass().getName());
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

}
