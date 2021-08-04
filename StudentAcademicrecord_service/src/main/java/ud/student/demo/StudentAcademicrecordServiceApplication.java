package ud.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient	
public class StudentAcademicrecordServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAcademicrecordServiceApplication.class, args);
		System.out.println( " Result Service activated .............");
	}

}
