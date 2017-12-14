package wang.wincent.microservice.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import wang.wincent.microservice.order.pojo.OrderPojo;
import wang.wincent.microservice.order.service.OrderService;


@RestController
public class OrderController {


	@Autowired
	private OrderService orderService;

	@GetMapping(value = "order/{orderId}")
	public OrderPojo queryOrderById(@PathVariable("orderId") String orderId) {
		return this.orderService.queryOrderById(orderId);
	}
	
	
	
}
