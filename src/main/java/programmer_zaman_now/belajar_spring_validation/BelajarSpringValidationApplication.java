package programmer_zaman_now.belajar_spring_validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import programmer_zaman_now.belajar_spring_validation.properties.DatabaseProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		DatabaseProperties.class
})
public class BelajarSpringValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringValidationApplication.class, args);
	}

}
