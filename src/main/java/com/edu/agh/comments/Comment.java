package com.edu.agh.comments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by asiab on 2016-11-04.
 */

@Entity
@Table(name = "T_COMMENTS")
public class Comment {
    @Column(name = "art_number")
    private String artNumber;
    private String content;
    private String name;

    public String getArtNumber() {
        return artNumber;
    }

    public void setArtNumber(String artNumber) {
        this.artNumber = artNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
