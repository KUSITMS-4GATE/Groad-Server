package groad.groad_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GroadServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroadServerApplication.class, args);
	}

}