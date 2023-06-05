package mubarak.oladejo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "mubaraktopic",
            groupId = "groupId"
    )
    void listen(String data){
        System.out.println("Listener received: " +data+ ".");
    }
}
