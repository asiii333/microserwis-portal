package com.edu.agh.services.titles;

import com.edu.agh.services.comments.CommentsServer;
import com.edu.agh.titles.TitleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Created by asiab on 2016-11-03.
 */
@SpringBootApplication
@EnableDiscoveryClient
@Import(TitleConfiguration.class)
public class TitlesServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "titles-server");

        SpringApplication.run(TitleConfiguration.class, args);
    }
}
