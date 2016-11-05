package com.edu.agh.titles

import spock.lang.Specification

/**
 * Created by asiab on 2016-11-04.
 */
class TitleUtilTest extends Specification {

    def Title  title = new Title()

    def "GetTitleResponse"() {
        given:
            title.tag = "info, polska, swiat";
        when:
            TitleResponse response = TitleUtil.getTitleResponse(title);
        then:
            response.getTagsList().size() == 3

    }
}
