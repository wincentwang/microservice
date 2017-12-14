package wang.wincent.microservice.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import wang.wincent.microservice.order.config.OrderServiceProperties;
import wang.wincent.microservice.order.feign.GoodsFeignClient;
import wang.wincent.microservice.order.pojo.GoodsPojo;

@Service
public class GoodsService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private GoodsFeignClient goodsFeignClient;
	
//	@Autowired
//	private OrderServiceProperties orderServiceConfig;

//	public GoodsPojo queryItemById(Long id)	 {
//		return this.restTemplate.getForObject(orderServiceConfig.getService().getUrl()
//				+ id, GoodsPojo.class);
//	}
	
//	public GoodsPojo queryItemById(Long id)	 {
//		String serviceId="microservice-goods";
//		List<ServiceInstance> instances = this.discoveryClient.getInstances(serviceId);
//		if(instances.isEmpty()){
//			return null;
//		}
//		ServiceInstance serviceInstance = instances.get(0);
//		String url = serviceInstance.getHost() + ":" + serviceInstance.getPort();
//		return this.restTemplate.getForObject("http://" + url + "/goods/" + id, GoodsPojo.class);
//	}
	
//	//Add Ribbon
//	public GoodsPojo queryItemById(Long id)	 {
//		String serviceId="microservice-goods";
//		return this.restTemplate.getForObject("http://" + serviceId + "/goods/" + id, GoodsPojo.class);
//	}
	
//   //Add Hystix
//	@HystrixCommand(fallbackMethod = "queryItemByIdFallbackMethod") // 进行容错处理
//	public GoodsPojo queryItemById(Long id) {
//		String serviceId = "microservice-goods";
//		return this.restTemplate.getForObject("http://" + serviceId + "/goods/" + id, GoodsPojo.class);
//	}
//	
//	public GoodsPojo queryItemByIdFallbackMethod(Long id){ // 请求失败执行的方法
//		return new GoodsPojo(id, "查询商品信息出错!", null, null, null);
//	}
	
	//Add Feign
	@HystrixCommand(fallbackMethod = "queryItemByIdFallbackMethod") // 进行容错处理
	public GoodsPojo queryItemById(Long id) {
		return this.goodsFeignClient.queryItemById(id);
	}
	
	public GoodsPojo queryItemByIdFallbackMethod(Long id){ // 请求失败执行的方法
		return new GoodsPojo(id, "查询商品信息出错!", null, null, null);
	}
}
