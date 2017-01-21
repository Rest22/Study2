package com.hm;


import java.util.ArrayList;

public class Topic {
    private ArrayList<String> posts = new ArrayList<>();

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }
}
