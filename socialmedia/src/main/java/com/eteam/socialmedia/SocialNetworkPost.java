package com.eteam.socialmedia;

import java.util.Date;

public class SocialNetworkPost {
    private Long id;
    private Date postDate;
    private String postCategory;
    private String author;
    private String content;
    private Integer viewCount;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getPostDate() {
        return postDate;
    }
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    public String getPostCategory() {
        return postCategory;
    }
    public void setPostCategory(String postCategory) {
        this.postCategory = postCategory;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Integer getViewCount() {
        return viewCount;
    }
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    
}
