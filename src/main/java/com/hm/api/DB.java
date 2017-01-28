package com.hm.api;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class DB {
    private static final MongoClient client;
    private static final MongoDatabase db;

    static {
        client = new MongoClient(new MongoClientURI("mongodb://test:test@ds034198.mlab.com:34198/nikit"));
        db = client.getDatabase("nikit");
    }
    public static MongoDatabase db() {
        return db;
    }
}
