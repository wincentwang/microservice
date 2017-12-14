package wang.wincent.microservice.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class PaymentApplication {

	@Bean 
	public RestTemplate restTemplate(){
		//添加OkHttp支持
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}
	
}
