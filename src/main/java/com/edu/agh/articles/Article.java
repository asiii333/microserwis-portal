package com.edu.agh.articles;

/**
 * Created by asiab on 2016-10-16.
 */
public class Article {
    private String id = "-1";
    private String title = "example title";
    private String content = "asd";

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
}
