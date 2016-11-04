package com.edu.agh.titles;

import java.util.List;

/**
 * Created by asiab on 2016-11-03.
 */
public class TitleResponse extends Title {
    private List<String> tagsList;

    public List<String> getTagsList() {
        return tagsList;
    }

    public void setTagsList(List<String> tagsList) {
        this.tagsList = tagsList;
    }
}
