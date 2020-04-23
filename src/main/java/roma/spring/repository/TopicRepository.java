package roma.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import roma.spring.topic.Topic;
@Service
public interface TopicRepository extends CrudRepository<Topic, Long> {
}
