package com.edu.agh.titles;

import javax.persistence.Column;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by asiab on 2016-11-03.
 */
public class TitleResponse extends Title {

    public TitleResponse(){
        super();
    }

    public TitleResponse(Title title, List<String> tagsList){
        this.setId(title.getId());
        this.setArtNumber(title.getArtNumber());
        this.setTitle(title.getTitle());
        
        this.setDescribe(title.getDescribe());
        this.setCategory(title.getCategory());
        this.setTag(title.getTag());
        this.tagsList = tagsList;
    }
    private List<String> tagsList;

    public List<String> getTagsList() {
        return tagsList;
    }

    public void setTagsList(List<String> tagsList) {
        this.tagsList = tagsList;
    }
}
