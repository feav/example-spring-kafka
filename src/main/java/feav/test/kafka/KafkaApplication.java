package feav.test.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.stream.IntStream;

@SpringBootApplication
public class KafkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}
}
