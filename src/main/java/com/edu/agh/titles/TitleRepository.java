package com.edu.agh.titles;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asiab on 2016-11-03.
 */
@Transactional
public interface TitleRepository extends PagingAndSortingRepository<Title, Long> {

    public Title findByArtNumber(String number);
    public List<Title> findByCategory(String category);
    public List<Title> findByCategory(String category, Pageable pageable );
    public List<Title> findAll();
    public Title save(Title title);

}