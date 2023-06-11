package mubarak.oladejo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "irespondtopic",
            groupId = "groupId"
    )
    void receive(String data){
        System.out.println("User received: " +data+ ".");
    }
}
