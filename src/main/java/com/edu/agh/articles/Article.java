package com.edu.agh.articles;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "T_ARTICLES")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "art_number")
    private String artNumber;
    private String content;
    private Date publication_date;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return "Article id: " + artNumber;
    }

    public String getNumber() {
        return artNumber;
    }

    public void setNumber(String art_number) {
        this.artNumber = art_number;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publication_date) {
        this.publication_date = publication_date;
    }
}
