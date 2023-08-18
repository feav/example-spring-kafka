package feav.test.kafka.kafkaMessaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenner {
    @KafkaListener(
            topics = "feavtopic",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Kafka Received : " + data);

    }
}
