package wang.wincent.microservice.goods.pojo;

public class GoodsPojo {

	private Long id;
	private String title;
	private String pic;
	private String desc;
	private Double price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "GoodsPojo [id=" + id + ", title=" + title + ", pic=" + pic + ", desc=" + desc + ", price=" + price
				+ "]";
	}
	public GoodsPojo() {
		super();
	}
	public GoodsPojo(Long id, String title, String pic, String desc, Double price) {
		super();
		this.id = id;
		this.title = title;
		this.pic = pic;
		this.desc = desc;
		this.price = price;
	}
	
	
	
	
}
