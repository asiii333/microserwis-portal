package com.edu.agh.titles;

import org.springframework.data.domain.PageRequest;

import java.util.*;

/**
 * Created by asiab on 2016-11-04.
 */
public class TitleUtil {

    private static final int PAGE_CATEGORY_AMOUNT = 30;
    private static final int PAGE_MAIN_AMOUNT = 5;

    public static List<TitleResponse> getResponseTitleList(List<Title> titles){
        List<TitleResponse> titleResponses = new ArrayList<TitleResponse>();

        for(Title title : titles ){
            titleResponses.add(getTitleResponse(title));
        }

        return titleResponses;
    }

    public static TitleResponse getTitleResponse(Title title){

            List<String> tags = convertTags(title.getTag());
            return new TitleResponse(title,tags);

    }

    private static List<String> convertTags(String tag){
        String[] tags = tag.split(",");
        List<String> tagsList = new ArrayList<String>(Arrays.asList(tags));
        return tagsList;
    }

    public static PageRequest preparePagedDataForCategory(int page) {
        PageRequest pageRequest = new PageRequest(page -1, PAGE_CATEGORY_AMOUNT);
        return pageRequest;
    }

    public static PageRequest preparePagedDataForMainPage() {
        int page = 0;
        PageRequest pageRequest = new PageRequest(page, PAGE_MAIN_AMOUNT);
        return pageRequest;
    }
}
