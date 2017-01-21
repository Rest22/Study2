package com.hm;


import java.util.ArrayList;

public class Topic {
    private String name;

    private ArrayList<Post> posts = new ArrayList<>();

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void setName (String name) { this.name = name; }

    public String getName() {
        return name;
    }
}
