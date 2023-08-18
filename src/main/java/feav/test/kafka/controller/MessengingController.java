package feav.test.kafka.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessengingController {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    @GetMapping("/{message}")
    String getMessage(@PathVariable("message") String message){
        String retour = "Receive message from API " + message;
        System.out.println(retour);
        kafkaTemplate.send("feavtopic",retour);
        return retour;
    }
}
