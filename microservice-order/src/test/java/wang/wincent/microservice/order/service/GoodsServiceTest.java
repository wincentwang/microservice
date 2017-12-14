package wang.wincent.microservice.order.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wang.wincent.microservice.order.OrderApplication;

@RunWith(SpringJUnit4ClassRunner.class)  
@SpringBootTest
@Import(OrderApplication.class)
public class GoodsServiceTest {

	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@Test
	public void test(){
		String serviceId = "microservice-goods";
		for (int i = 0; i < 100; i++) {
			ServiceInstance serviceInstance = this.loadBalancerClient.choose(serviceId);
			System.out.println("第"+(i+1)+"次：" + serviceInstance.getHost() + ": " + serviceInstance.getPort());
		}
	}

	
}
