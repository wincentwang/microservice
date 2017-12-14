package wang.wincent.microservice.goods.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import wang.wincent.microservice.goods.pojo.GoodsPojo;

@Service
public class GoodsService {


	private static final Map<Long, GoodsPojo> MAP = new HashMap<Long, GoodsPojo>();
	
	static { 
		// 准备一些静态数据
		MAP.put(1L, new GoodsPojo(1L, "商品标题1", "http://图片1", "商品描述1", 1000.0));
		MAP.put(2L, new GoodsPojo(1L, "商品标题2", "http://图片2", "商品描述2", 2000.0));
		MAP.put(3L, new GoodsPojo(1L, "商品标题3", "http://图片3", "商品描述3", 3000.0));
		MAP.put(4L, new GoodsPojo(1L, "商品标题4", "http://图片4", "商品描述4", 4000.0));
		MAP.put(5L, new GoodsPojo(1L, "商品标题5", "http://图片5", "商品描述5", 5000.0));
		MAP.put(6L, new GoodsPojo(1L, "商品标题6", "http://图片6", "商品描述6", 6000.0));
		MAP.put(7L, new GoodsPojo(1L, "商品标题7", "http://图片7", "商品描述7", 7000.0));
		MAP.put(8L, new GoodsPojo(1L, "商品标题8", "http://图片8", "商品描述8", 8000.0));
	}
	
	public GoodsPojo queryGoodsById(Long id) {
		return MAP.get(id);
	}
	
}
