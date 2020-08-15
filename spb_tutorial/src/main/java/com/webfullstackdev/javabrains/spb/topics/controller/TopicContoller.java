package com.webfullstackdev.javabrains.spb.topics.controller;

import com.webfullstackdev.javabrains.spb.topics.model.Topic;
import com.webfullstackdev.javabrains.spb.topics.services.TopicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class TopicContoller {

    @Autowired
    TopicServices topicServices;

    // get topic rest api
    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicServices.getAllTopics();
    }

    // post new topic rest api
    @PostMapping("/topics")
    public Topic postNewTopic(@RequestBody Topic topic){
        return topicServices.createNewTopic(topic);
    }

    // view exiting topic
    @GetMapping("/topics/{id}")
    public ResponseEntity<Optional<Topic>> viewParticualTopic(@PathVariable Long id){
        return topicServices.findParticularTopic(id);
    }
    
    // put update topic rest api
    @PutMapping("/topics/{id}")
    public ResponseEntity<Topic> updateParticualTopic(@PathVariable Long id, @RequestBody Topic topic){
        return topicServices.updateParticularTopic(id, topic);
    }
    
    // delete - particular topic res api
    @DeleteMapping("/topics/{id}")
    public ResponseEntity < Map < String, Boolean >> deleteTopic(@PathVariable Long id) {
        return topicServices.deleteaTopic(id);
    }
    
}
