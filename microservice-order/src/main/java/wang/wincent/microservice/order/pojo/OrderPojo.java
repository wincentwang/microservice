package wang.wincent.microservice.order.pojo;

import java.util.Date;
import java.util.List;

public class OrderPojo {

	private Long orderId;
	private Long userId;
	private Date createDate;
	private Date updateDate;
	private List<OrderDetailPojo> orderDetails;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public List<OrderDetailPojo> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetailPojo> orderDetails) {
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		return "OrderPojo [orderId=" + orderId + ", userId=" + userId + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", orderDetails=" + orderDetails + "]";
	}
	
	
}
