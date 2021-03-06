package ud.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient	
public class StudentManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentApplication.class, args);
	System.out.println(" Student registration Service is Up  on port .....8081");
	}
	
	@Bean
	@LoadBalanced // to remove the unknow host exceptions 
	RestTemplate getresttemplate()
	{
		return new RestTemplate();
	}

}
