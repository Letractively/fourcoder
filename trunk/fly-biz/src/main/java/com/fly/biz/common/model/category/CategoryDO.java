package com.fly.biz.common.model.category;

import java.util.Date;


/**
 * Category
 * @author hengheng
 *
 */

public class CategoryDO{

	private long catId;//��ĿID
	private String catName;//��Ŀ����
	private Date gmtCreate;//��Ŀ�Ĵ�������
	private Date gmtModified;//��Ŀ���޸�ʱ��
	private String attribute;//��Ŀ����
	
	
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
