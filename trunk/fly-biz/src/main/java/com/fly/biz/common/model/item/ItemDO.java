package com.fly.biz.common.model.item;

import java.util.Date;


public class ItemDO{

	
	private long itemId;//��Ʒ��id
	private String itemName;//��Ʒ������
	private String itemTitle;//��Ʒ����ʱ����
	private String itemPicUrl;//��ƷͼƬurl
	private long itemPrice;//��Ʒ�۸�
	private long shareNum;//��Ʒ�������
	private long hitNum;//��Ʒ�������
	private int catId;//��Ʒ����Ŀ
	private String attribute;//��Ʒ����
	private Date gmtCreate;//��Ʒ�Ĵ�������
	private Date gmtModified;//��Ʒ���޸�ʱ��
	
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
