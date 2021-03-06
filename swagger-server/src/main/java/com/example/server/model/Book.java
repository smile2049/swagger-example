package com.example.server.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>Created by qct on 2017/10/27.
 */
@ApiModel
public class Book {

    private int id;
    private int categoryId;
    @ApiModelProperty("书名")
    private String name;
    @ApiModelProperty("作者")
    private String author;

    public Book(int id, int categoryId, String name, String author) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
