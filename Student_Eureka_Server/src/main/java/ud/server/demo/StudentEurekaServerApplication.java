package ud.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentEurekaServerApplication.class, args);
		System.out.println("Universsity application server ....****** working  ");
	}

}
