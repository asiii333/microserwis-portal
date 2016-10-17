package com.edu.agh.articles;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@ComponentScan
public class ArticleConfiguration {
    protected Logger logger;

    public ArticleConfiguration() {
        logger = Logger.getLogger(getClass().getName());
    }

}
