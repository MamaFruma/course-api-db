package roma.spring.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import roma.spring.course.Course;

import java.util.List;
@Service
public interface CourseRepository extends CrudRepository<Course, Long>{
    List<Course> findByTopicId(Long topicId);

}
