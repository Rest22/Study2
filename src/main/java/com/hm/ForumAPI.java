package com.hm;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping ("/forum")
public class ForumAPI {

    public static HashSet<Topic> topics = new HashSet<>();

    @RequestMapping("/login")
    public ResponseEntity Login (@RequestParam("login")String login, @RequestParam ("pass") String pass) {
        return  ResponseEntity.ok(UserHolder.search(login, pass));

    }

    @RequestMapping("/createForum")
    public ResponseEntity createForum (@RequestParam("name")String name) {
        Topic topic = new Topic();
        topic.setName(name);
        topics.add(topic);
        return ResponseEntity.ok(topic);
    }

        @RequestMapping("/getTopics")
        public Set<Topic> getTopics() {
            return topics;
        }

            @RequestMapping("/getTopic/{name}")
            public ResponseEntity getTopic (@PathVariable("name") String name) {
                return ResponseEntity
                        .ok(topics.stream()
                                .filter(x -> x.getName().equals(name))
                                .findFirst()
                                .orElse(null)
                        );

        }
    }


