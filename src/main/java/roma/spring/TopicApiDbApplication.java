package roma.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication(scanBasePackages =
        {"roma.spring.course", "roma.spring.repository",
                "roma.spring.topic", "roma.spring.exception"})
@EnableJpaAuditing
@EntityScan(basePackages = {"roma.spring.course", "roma.spring.topic"})
public class TopicApiDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopicApiDbApplication.class, args);
    }

}
