package com.edu.agh.services.comments;

import com.edu.agh.comments.CommentsConfiguration;
import com.edu.agh.services.articles.ArticlesServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Created by asiab on 2016-11-03.
 */
@SpringBootApplication
@EnableDiscoveryClient
@Import(CommentsConfiguration.class)
public class CommentsServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "comments-server");

        SpringApplication.run(CommentsServer.class, args);
    }
}
