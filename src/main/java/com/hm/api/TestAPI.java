package com.hm.api;

import com.google.gson.Gson;
import com.hm.User;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

import static com.hm.api.DB.db;


@RestController
@RequestMapping("/test")
public class TestAPI {

	public static HashSet<User> users = new HashSet<>();

	static {
		users.add(new User("JohnDoe1", "12"));
		users.add(new User("JohnDoe2", "123"));
		users.add(new User("JohnDoe3", "1234"));
		users.add(new User("JohnDoe4", "12345"));
		users.add(new User("JohnDoe5", "123456"));
	}


	@RequestMapping("/test")
	public String testUser() {
		return "test123";
	}

	@RequestMapping ("/createDB")
	public String createDB() {
		db().drop();
		db().createCollection("user");
		db().getCollection("user").insertOne(Document.parse(new Gson().toJson((new User ("JohnDoe1", "12")))));
		db().getCollection("user").insertOne(Document.parse(new Gson().toJson((new User ("JohnDoe2", "123")))));
		db().getCollection("user").insertOne(Document.parse(new Gson().toJson((new User ("JohnDoe3", "1234")))));
		db().getCollection("user").insertOne(Document.parse(new Gson().toJson((new User ("JohnDoe4", "12345")))));
		db().getCollection("user").insertOne(Document.parse(new Gson().toJson((new User ("JohnDoe5", "123456")))));
		return "OK";
	}
}
