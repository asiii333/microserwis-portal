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
    public TitleResponse getTitleForArticle(@PathVariable("articleNumber") String articleNumber) {

        logger.info("title-service get titles for: "  + articleNumber);

        Title title = titleRepository.findByArtNumber(articleNumber);
        TitleResponse response = TitleUtil.getTitleResponse(title);

        logger.info("title-service title ");

            return response;

    }

    @RequestMapping(value = "/title/{category}/{page}")
    public List<TitleResponse> getTitlesByCategoryLimited(@PathVariable("category") String category,
                                       @PathVariable("page") int page) {

        logger.info("title-service find title byNumber() invoked: " + category);

        PageRequest pageRequest = TitleUtil.preparePagedDataForCategory(page);
        List<Title> titles = titleRepository.findByCategory(category,pageRequest);
        List<TitleResponse> titleResponses= TitleUtil.getResponseTitleList(titles);


        logger.info("title-service found article number:" + titles.size() );


            return titleResponses;
    }

    @RequestMapping(value = "/title/all")
    public List<TitleResponse> getAllTitles() {

        logger.info("title-service find all article ");

        List<Title> titles = titleRepository.findAll();
        List<TitleResponse> titleResponses= TitleUtil.getResponseTitleList(titles);


        logger.info("title-service find all article number:" + titles.size() );


        return titleResponses;
    }

    @RequestMapping(value = "/title/main/{category}")
    public List<TitleResponse> getTitlesByCategoryForMainPage(@PathVariable("category") String category) {

        logger.info("title-service find title byNumber() invoked: " + category);

        PageRequest pageRequest = TitleUtil.preparePagedDataForMainPage();
        List<Title> titles = titleRepository.findByCategory(category,pageRequest);
        List<TitleResponse> titleResponses= TitleUtil.getResponseTitleList(titles);

        logger.info("title-service found article number: " + titles.size());


        return titleResponses;
    }




    @RequestMapping(method = RequestMethod.POST, value = "/title/add")
    public Title addTitle(@RequestBody Title title) {

        logger.info("add new title, to article: " + title.getArtNumber());

        Title newTitle = titleRepository.save(title);

        logger.info("title add: " + newTitle.getArtNumber());

        return newTitle;

    }
}


