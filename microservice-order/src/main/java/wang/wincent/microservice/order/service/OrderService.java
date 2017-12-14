package wang.wincent.microservice.order.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wang.wincent.microservice.order.pojo.GoodsPojo;
import wang.wincent.microservice.order.pojo.OrderDetailPojo;
import wang.wincent.microservice.order.pojo.OrderPojo;


@Service
public class OrderService {
	
	@Autowired
	private GoodsService goodsService;

	private static final Map<String, OrderPojo> MAP = new HashMap<String, OrderPojo>();
	
	static {
		// 构造测试数据
		OrderPojo order = new OrderPojo();
		order.setOrderId(1l);
		order.setCreateDate(new Date());
		order.setUpdateDate(order.getCreateDate());
		order.setUserId(1L);
		List<OrderDetailPojo> orderDetails = new ArrayList<OrderDetailPojo>();

		GoodsPojo goods = new GoodsPojo();// 此处并没有商品的数据，需要调用商品微服务获取
		goods.setId(1L);
		orderDetails.add(new OrderDetailPojo(order.getOrderId(), goods));

		goods = new GoodsPojo(); // 构造第二个商品数据
		goods.setId(2L);
		orderDetails.add(new OrderDetailPojo(order.getOrderId(), goods));
		order.setOrderDetails(orderDetails);
		MAP.put(order.getOrderId()+"", order);
	}
	
	
	public OrderPojo queryOrderById(String orderId) {
		OrderPojo order = MAP.get(orderId);
		if (null == order) {
			return null;
		}
		List<OrderDetailPojo> orderDetails = order.getOrderDetails();
		for (OrderDetailPojo orderDetail : orderDetails) {
			GoodsPojo goods = this.goodsService.queryItemById(orderDetail.getGoods()
					.getId());
			if (null == goods) {
				continue;
			}
			orderDetail.setGoods(goods);
		}
		return order;
	}
	
}
