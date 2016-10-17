package com.edu.agh.articles;

import com.edu.agh.exceptions.ArticleNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping(produces = "application/json")
public class ArticlesController {


    protected Logger logger = Logger.getLogger(ArticlesController.class
            .getName());

    @RequestMapping(value = "/hello/{articleId}")
    public Article byNumber(@PathVariable("articleId") String articleId)  {

        logger.info("artivle-service byNumber() invoked: " + articleId);
        Article article = new Article();
        article.setId(articleId);
        logger.info("artivle-service byNumber() found: " + article);

        if (article == null)
            throw new ArticleNotFoundException(articleId);
        else {
            return article;
        }
    }
}
