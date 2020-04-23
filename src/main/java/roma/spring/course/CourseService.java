package roma.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roma.spring.exception.NoEntityException;
import roma.spring.repository.CourseRepository;

import java.util.*;


@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public List <Course> getAllCourses(Long topicId) {
        return new ArrayList<>(courseRepository.findByTopicId(topicId));
        }

    public Course getCourse(Long id) throws NoEntityException {
        return courseRepository.findById(id).orElseThrow(() -> new NoEntityException(id));
    }

    public void addCourse(Course course) {
            courseRepository.save(course);
    }
    public void updateCourse(Course course, Long id) {
        Course course1 = courseRepository.findById(id).get();
        course1.setName(course.getName());
        course1.setDescription(course.getDescription());
        courseRepository.save(course1);
    }
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }


}
