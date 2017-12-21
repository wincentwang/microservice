package wang.wincent.microservice.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//注册中心用Eureka
@EnableEurekaServer 
@SpringBootApplication
public class RegisterServer {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServer.class, args);
	}
}
