package com.edu.agh.comments;

import com.edu.agh.titles.Title;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asiab on 2016-11-03.
 */
@Transactional
public interface CommentsRepository extends Repository<Comment, Long> {

    List<Comment> findByArtNumber(String number);
    List<Comment> findByArtNumberPaged(String number, Pageable pageable);
    Comment save(Comment comment);
}