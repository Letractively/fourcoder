package com.fly.biz.common.model.category;

import java.util.Date;


/**
 * Category
 * @author hengheng
 *
 */

public class CategoryDO{

	private long catId;//类目ID
	private String catName;//类目名称
	private Date gmtCreate;//类目的创建日期
	private Date gmtModified;//类目的修改时间
	private String attribute;//类目属性
	
	
	public long getCatId() {
		return catId;
	}
	public void setCatId(long catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
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
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
