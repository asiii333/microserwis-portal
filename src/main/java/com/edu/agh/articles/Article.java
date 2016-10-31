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
    private String title;
    private String content;
    private String category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return "Article id: " + id + " title: " + title;
    }

    public String getNumber() {
        return artNumber;
    }

    public void setNumber(String art_number) {
        this.artNumber = art_number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
