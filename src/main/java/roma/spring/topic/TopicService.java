package roma.spring.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roma.spring.exception.NoEntityException;
import roma.spring.repository.TopicRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List <Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
        }

    public Optional<Topic> getTopic(Long id) throws NoEntityException {
        return topicRepository.findById(id); //.orElseThrow(() -> new NoEntityException(id));
    }

    public void addTopics(Topic topic) {
        topicRepository.save(topic);
    }
    public void updateTopic(Long id, Topic topic) {
            topicRepository.save(topic);
    }
    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }


}
