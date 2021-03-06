package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品简化接口套餐组明细信息
 *
 * @author auto create
 * @since 1.0, 2020-06-21 14:57:42
 */
public class KbdishGroupDetailSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 6137553951932356294L;

	/**
	 * 加价
	 */
	@ApiField("add_price")
	private String addPrice;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 外部菜品skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 套餐明细规格，default：是否默认；true：默认；false：不默认
	 */
	@ApiField("rule")
	private String rule;

	/**
	 * 排序值
	 */
	@ApiField("sort")
	private String sort;

	public String getAddPrice() {
		return this.addPrice;
	}
	public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
	}

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getRule() {
		return this.rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
