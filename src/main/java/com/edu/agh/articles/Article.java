package com.edu.agh.articles;

import javax.persistence.*;


@Entity
@Table(name = "T_ARTICLES")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(name = "art_number")
    private String artNumber;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return "Article id: " + id;
    }

    public String getNumber() {
        return artNumber;
    }

    public void setNumber(String art_number) {
        this.artNumber = art_number;
    }

}
