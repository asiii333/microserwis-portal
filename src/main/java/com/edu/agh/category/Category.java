package com.edu.agh.category;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by asiab on 2016-10-17.
 */
@Entity
@Table(name = "T_CATEGORY")
public class Category {
    @Id
    private java.lang.String id = "-1";
    private java.lang.String name = "-1";

    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
