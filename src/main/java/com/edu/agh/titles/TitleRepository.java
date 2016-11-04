package com.edu.agh.titles;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asiab on 2016-11-03.
 */
@Transactional
public interface TitleRepository extends Repository<Title, Long> {

    public Title findByArtNumber(String number);
    public List<Title> findByCategory(String category);
    public List<Title> findByCategoryPaged(String category, Pageable pageable );
    public Title save(Title title);

}