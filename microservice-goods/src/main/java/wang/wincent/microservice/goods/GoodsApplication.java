package wang.wincent.microservice.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 商品应用
 * @author wincent.wang
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GoodsApplication {

	public static void main(String[] args){
		SpringApplication.run(GoodsApplication.class, args);
	}
	
}
