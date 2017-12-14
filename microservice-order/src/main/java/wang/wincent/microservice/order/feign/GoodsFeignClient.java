package wang.wincent.microservice.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import wang.wincent.microservice.order.pojo.GoodsPojo;

@FeignClient(value = "microservice-goods") 
public interface GoodsFeignClient {

	// 这里定义了类似于SpringMVC用法的方法，就可以进行RESTful的调用了
	@RequestMapping(value = "/goods/{id}", method = RequestMethod.GET)
	public GoodsPojo queryItemById(@PathVariable("id") Long id);
}
