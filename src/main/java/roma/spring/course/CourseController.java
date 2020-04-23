package roma.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import roma.spring.exception.NoEntityException;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("topics/{topicId}/courses")
    public List <Course> getAllCourses(@PathVariable Long topicId) {
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable Long id) throws NoEntityException {
        return courseService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable Long topicId) {
        course.setTopic(topicId);
        courseService.addCourse(new Course(course.getName(), course.getDescription(), topicId));
    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable Long topicId, @PathVariable Long id) {
        //course.setTopic(topicId);
        courseService.updateCourse(course, id);
    }

    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

}
