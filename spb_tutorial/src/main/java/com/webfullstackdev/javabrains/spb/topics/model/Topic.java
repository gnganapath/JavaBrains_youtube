package com.webfullstackdev.javabrains.spb.topics.model;
import javax.persistence.*;

@Entity
@Table(name ="topics")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "topic_name")
    private String topicName;

    @Column( name = "topc_desc")
    private String topicDescription;

    public Topic() {
    }

    public Topic(String topicName, String topicDescription) {
        super();
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
}
