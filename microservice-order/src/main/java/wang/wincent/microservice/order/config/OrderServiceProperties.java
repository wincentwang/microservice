package wang.wincent.microservice.order.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="goods") 
public class OrderServiceProperties {

	private GoodsServiceProperties service = new GoodsServiceProperties();

	public GoodsServiceProperties getService() {
		return service;
	}

	public void setService(GoodsServiceProperties service) {
		this.service = service;
	}

	
	
	
}
