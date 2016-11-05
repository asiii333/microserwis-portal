package com.edu.agh.comments;

import com.edu.agh.articles.ArticlesController;
import com.edu.agh.exceptions.ArticleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by asiab on 2016-11-04.
 */
@RestController
@RequestMapping(produces = "application/json")
public class CommentsController {

    protected Logger logger = Logger.getLogger(ArticlesController.class
            .getName());

    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/comments/{articleNumber}")
    public List<Comment> byNumber(@PathVariable("articleNumber") String articleNumber) {

        logger.info("comment-service get comments for: "  + articleNumber);

        List<Comment> comment = commentRepository.findByArtNumber(articleNumber);

        logger.info("comment-service comments number: " + comment.size());

        if (comment == null)
            throw new ArticleNotFoundException(articleNumber);
        else {
            return comment;
        }
    }

    @RequestMapping(value = "/comments/{articleNumber}/{page}")
    public List<Comment> byNumberPaged(@PathVariable("articleNumber") String articleNumber,
                                       @PathVariable("page") int page) {

        logger.info("article-service find article byNumber() invoked: " + articleNumber);

        PageRequest pageRequest = prepareData(page);
        List<Comment> comment = commentRepository.findByArtNumber(articleNumber,pageRequest);

        logger.info("artivle-service byNumber() found: " + articleNumber);

        if (comment == null)
            throw new ArticleNotFoundException(articleNumber);
        else {
            return comment;
        }
    }

    private PageRequest prepareData(int page) {
        int fromComment = 10 * (page -1);
        int toComment = (10 * page) + 9;
        PageRequest pageRequest = new PageRequest(fromComment, toComment);
        return pageRequest;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/comments/{articleNumber}/add")
    public Comment addComment(@RequestBody Comment comment) {

        logger.info("add new comment, to article: " + comment.getArtNumber());

        Comment newComment = commentRepository.save(comment);

        logger.info("comment add to article: " + comment.getArtNumber());

        if (comment == null)
            throw new ArticleNotFoundException(newComment.getArtNumber());
        else {
            return newComment;
        }
    }
}
