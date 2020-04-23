package roma.spring.topic;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import roma.spring.course.Course;

@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;


    //@OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //@JoinColumn(name = "topic_id")
    //private Set<Course> courses;

    public Topic(){};

    public Topic(Long id, String name, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
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



}
