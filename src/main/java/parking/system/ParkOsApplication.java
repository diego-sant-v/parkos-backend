package parking.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "parking.system.domain.model")
@EnableJpaRepositories(basePackages = "parking.system.adapters.outbound.persistence.jpa")
public class ParkOsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkOsApplication.class, args);
	}
}