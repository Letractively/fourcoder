package com.fly.biz.dao.item.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fly.biz.common.model.item.ItemDO;

import com.fly.biz.dao.item.ItemDAO;

public class ItemDAOImpl extends SqlMapClientDaoSupport implements ItemDAO{

	
	/**
	 * 获取所有商品信息
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<ItemDO> getItemList() {
		return this.getSqlMapClientTemplate().queryForList("UserDAO.getAllItems",null);
	}

	/**
	 * 根据名称获取商品
	 * @param itemName
	 * @return
	 */
	public ItemDO getByItemName(String itemName) {
		 return (ItemDO)this.getSqlMapClientTemplate().queryForObject("ItemDAO.getItemByName",itemName);
	}

	/**
	 * 根据商品ID获取商品
	 * @param itemId
	 * @return
	 */
	public ItemDO getByItemId(String itemId) {
		return (ItemDO)this.getSqlMapClientTemplate().queryForObject("ItemDAO.getItemById",itemId);
	}

	/**
	 * 保存商品信息
	 * @param itemDO
	 */
	public void saveItem(ItemDO itemDO) {
		 this.getSqlMapClientTemplate().insert("ItemDAO.insertItem",itemDO);
	}

	/**
	 * 删除商品信息
	 * @param itemId
	 */
	public void deleteItem(long itemId) {
		this.getSqlMapClientTemplate().delete("ItemDAO.deleteItem", itemId);
	}

	/**
	 * 更新商品信息
	 * @param itemDO
	 */
	public void updateItem(ItemDO itemDO) {
		this.getSqlMapClientTemplate().update("ItemDAO.updateItem", itemDO);
	}

	/**
	 * 更新分享次数信息
	 * @param itemDO
	 */
	public void updateItemShareNumber(ItemDO itemDO) {
		this.getSqlMapClientTemplate().update("ItemDAO.updateItemShareNum", itemDO);		
	}

	/**
	 * 更新对象点击信息
	 * @param itemDO
	 */
	public void updateItemHitnumber(ItemDO itemDO) {
		this.getSqlMapClientTemplate().update("ItemDAO.updateItemHitNum", itemDO);
	}



}
