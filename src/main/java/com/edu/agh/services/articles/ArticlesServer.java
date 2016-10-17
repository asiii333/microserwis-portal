package com.edu.agh.services.articles;

import com.edu.agh.articles.ArticleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Created by asiab on 2016-10-16.
 */
@SpringBootApplication
@EnableDiscoveryClient
@Import(ArticleConfiguration.class)
public class ArticlesServer {
    public static void main(String[] args) {
        // Tell server to look for registration.properties or registration.yml
        System.setProperty("spring.config.name", "articles-server");

        SpringApplication.run(ArticlesServer.class, args);
    }
}
