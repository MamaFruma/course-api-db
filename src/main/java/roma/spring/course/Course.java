package roma.spring.course;
import roma.spring.topic.Topic;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Long topic_id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "topic_id", updatable = false, insertable = false)
    private Topic topic;

    public Course(){};
    public Course(String name, String description, Long topicId) {
        this.name = name;
        this.description = description;
        this.topic_id = topicId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public Topic setTopic(Long topicId){
        return new Topic(topicId, "", "");
    }
    public Long getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Long topic_id) {
        this.topic_id = topic_id;
    }
}
