package in.nareshit.ajeet.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HealthCareExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(HealthCareExampleApplication.class, args);
		System.out.println("Bean Definitions Count::"+context.getBeanDefinitionCount());
	}

}
