package com.webfullstackdev.javabrains.spb.topics.dao;

import com.webfullstackdev.javabrains.spb.topics.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicDao extends JpaRepository<Topic, Long> {

}
