package com.edu.agh.comments;

import com.edu.agh.titles.Title;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asiab on 2016-11-03.
 */
@Transactional
public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

    List<Comment> findByArtNumber(String number);
    List<Comment> findByArtNumber(String number, Pageable pageable);
    Comment save(Comment comment);
}