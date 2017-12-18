package wang.wincent.microservice.goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import wang.wincent.microservice.goods.jdbc.JdbcConfigInfo;
import wang.wincent.microservice.goods.pojo.GoodsPojo;
import wang.wincent.microservice.goods.service.GoodsService;

/**
 * 商品应用
 * @author wincent.wang
 */
@RestController
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private JdbcConfigInfo jdbcConfigInfo;
	
	@GetMapping(value = "goods/{id}")
	public GoodsPojo queryItemById(@PathVariable("id") Long id) {
		return this.goodsService.queryGoodsById(id);
	}
	
	@GetMapping(value = "goods/jdbc")
	public String jdbc() {
		return jdbcConfigInfo.toString();
	}
	
}
