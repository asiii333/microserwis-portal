package com.edu.agh.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.logging.Logger;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ArticleConfiguration extends WebMvcConfigurerAdapter {
    protected Logger logger;

    public ArticleConfiguration() {
        logger = Logger.getLogger(getClass().getName());
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

}
