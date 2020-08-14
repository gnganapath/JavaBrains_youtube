package com.webfullstackdev.javabrains.spb.topics.services;


import com.webfullstackdev.javabrains.spb.topics.dao.TopicDao;
import com.webfullstackdev.javabrains.spb.topics.model.Topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TopicServices {

    @Autowired
    TopicDao topicRepository;

    // get
    public List<Topic> getAllTopics(){
    	
        return topicRepository.findAll();
        
    }

    // post
    public Topic createNewTopic(Topic topic){
    	
        return topicRepository.save(topic);
    }

    // view
    public ResponseEntity<Optional<Topic>> findParticularTopic(Long id){
    	
        Optional<Topic> topic; 
        topic =   topicRepository.findById(id);    // exception need to cover . Else it will give <option> as additional part
        return ResponseEntity.ok(topic);

    }
    
    //update
    public ResponseEntity<Topic> updateParticularTopic(Long id, Topic updateTopicDetails){
	
	   Topic topic;
	   topic = topicRepository.findById(id).orElseThrow( );
	   topic.setTopicName(updateTopicDetails.getTopicName());
	   topic.setTopicDescription(updateTopicDetails.getTopicDescription());
	   
	   Topic updatedTopic = topicRepository.save(topic);
	   
	   return ResponseEntity.ok(updatedTopic);
    }
    
    // delete
    public ResponseEntity< Map<String , Boolean>> deleteaTopic(Long id){
    	Topic topic;
    	topic = topicRepository.findById(id).orElseThrow( );    	
    	topicRepository.delete(topic);
    	Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted the topic", Boolean.TRUE);
		return null;
    	
    }

}
