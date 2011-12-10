package com.fly.biz.common.model.item;

import java.util.Date;


public class ItemDO{

	
	private long itemId;//商品的id
	private String itemName;//商品的名称
	private String itemTitle;//商品悬挂时名称
	private String itemPicUrl;//商品图片url
	private long itemPrice;//商品价格
	private long shareNum;//商品分享次数
	private long hitNum;//商品点击次数
	private int catId;//商品的类目
	private String attribute;//商品属性
	private Date gmtCreate;//商品的创建日期
	private Date gmtModified;//商品的修改时间
	
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemPicUrl() {
		return itemPicUrl;
	}
	public void setItemPicUrl(String itemPicUrl) {
		this.itemPicUrl = itemPicUrl;
	}
	public long getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(long itemPrice) {
		this.itemPrice = itemPrice;
	}
	public long getShareNum() {
		return shareNum;
	}
	public void setShareNum(long shareNum) {
		this.shareNum = shareNum;
	}
	public long getHitNum() {
		return hitNum;
	}
	public void setHitNum(long hitNum) {
		this.hitNum = hitNum;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	
	
	
	
	
	
	
}
