package wang.wincent.microservice.order.pojo;


public class OrderDetailPojo {

	private Long orderId;
	private GoodsPojo goods=new GoodsPojo();
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public GoodsPojo getGoods() {
		return goods;
	}
	public void setGoods(GoodsPojo goods) {
		this.goods = goods;
	}
	public OrderDetailPojo() {
		super();
	}
	public OrderDetailPojo(Long orderId, GoodsPojo goods) {
		super();
		this.orderId = orderId;
		this.goods = goods;
	}
	
	
	
	
}
