package com.edu.agh.titles;

import com.edu.agh.comments.Comment;
import com.edu.agh.exceptions.ArticleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by asiab on 2016-11-03.
 */
@RestController
@RequestMapping(produces = "application/json")
public class TitleController {

    protected Logger logger = Logger.getLogger(TitleController.class
            .getName());

    @Autowired
    private TitleRepository titleRepository;

    @RequestMapping(value = "/title/{articleNumber}")
    public Title getTitleForArticle(@PathVariable("articleNumber") String articleNumber) {

        logger.info("title-service get titles for: "  + articleNumber);

        Title title = titleRepository.findByArtNumber(articleNumber);

        logger.info("title-service title title: " + title.getTitle());

            return title;

    }

    @RequestMapping(value = "/title/{category}/{page}")
    public List<Title> getTitlesByCategoryLimited(@PathVariable("category") String category,
                                       @PathVariable("page") int page) {

        logger.info("title-service find title byNumber() invoked: " + category);

        PageRequest pageRequest = preparePagedData(page);
        List<Title> title = titleRepository.findByCategoryPaged(category,pageRequest);

        logger.info("title-service found article number: " );


            return title;
    }

    @RequestMapping(value = "/title/main/{category}")
    public List<Title> getTitlesByCategoryForMainPage(@PathVariable("category") String category) {

        logger.info("title-service find title byNumber() invoked: " + category);

        PageRequest pageRequest = new PageRequest(1,6);
        List<Title> title = titleRepository.findByCategoryPaged(category,pageRequest);

        logger.info("title-service found article number: " );


        return title;
    }

    private PageRequest preparePagedData(int page) {
        int fromComment = 10 * (page -1);
        int toComment = (10 * page) + 9;
        PageRequest pageRequest = new PageRequest(fromComment, toComment);
        return pageRequest;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/title/{articleNumber}/add")
    public Title addTitle(@RequestBody Title title) {

        logger.info("add new title, to article: " + title.getArtNumber());

        Title newTitle = titleRepository.save(title);

        logger.info("title add: " + newTitle.getArtNumber());

        return newTitle;

    }
}


