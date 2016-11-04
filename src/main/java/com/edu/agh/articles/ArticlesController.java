package com.edu.agh.articles;

import com.edu.agh.exceptions.ArticleNotFoundException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping(produces = "application/json")
public class ArticlesController {


    protected Logger logger = Logger.getLogger(ArticlesController.class
            .getName());

    @Autowired
    private ArticleRepository articleRepository;

    @RequestMapping(value = "/article/{articleNumber}")
    public Article byNumber(@PathVariable("articleNumber") String articleNumber) {

        logger.info("article-service find article byNumber() invoked: " + articleNumber);

        Article article = articleRepository.findByArtNumber(articleNumber);

        logger.info("artivle-service byNumber() found: " + articleNumber);

        if (article == null)
            throw new ArticleNotFoundException(articleNumber);
        else {
            return article;
        }
    }

}
