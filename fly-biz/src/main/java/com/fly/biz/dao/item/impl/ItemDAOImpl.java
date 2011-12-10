package com.fly.biz.dao.item.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fly.biz.common.model.item.ItemDO;

import com.fly.biz.dao.item.ItemDAO;

public class ItemDAOImpl extends SqlMapClientDaoSupport implements ItemDAO{

	
	/**
	 * ��ȡ������Ʒ��Ϣ
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<ItemDO> getItemList() {
		return this.getSqlMapClientTemplate().queryForList("UserDAO.getAllItems",null);
	}

	/**
	 * �������ƻ�ȡ��Ʒ
	 * @param itemName
	 * @return
	 */
	public ItemDO getByItemName(String itemName) {
		 return (ItemDO)this.getSqlMapClientTemplate().queryForObject("ItemDAO.getItemByName",itemName);
	}

	/**
	 * ������ƷID��ȡ��Ʒ
	 * @param itemId
	 * @return
	 */
	public ItemDO getByItemId(String itemId) {
		return (ItemDO)this.getSqlMapClientTemplate().queryForObject("ItemDAO.getItemById",itemId);
	}

	/**
	 * ������Ʒ��Ϣ
	 * @param itemDO
	 */
	public void saveItem(ItemDO itemDO) {
		 this.getSqlMapClientTemplate().insert("ItemDAO.insertItem",itemDO);
	}

	/**
	 * ɾ����Ʒ��Ϣ
	 * @param itemId
	 */
	public void deleteItem(long itemId) {
		this.getSqlMapClientTemplate().delete("ItemDAO.deleteItem", itemId);
	}

	/**
	 * ������Ʒ��Ϣ
	 * @param itemDO
	 */
	public void updateItem(ItemDO itemDO) {
		this.getSqlMapClientTemplate().update("ItemDAO.updateItem", itemDO);
	}

	/**
	 * ���·��������Ϣ
	 * @param itemDO
	 */
	public void updateItemShareNumber(ItemDO itemDO) {
		this.getSqlMapClientTemplate().update("ItemDAO.updateItemShareNum", itemDO);		
	}

	/**
	 * ���¶�������Ϣ
	 * @param itemDO
	 */
	public void updateItemHitnumber(ItemDO itemDO) {
		this.getSqlMapClientTemplate().update("ItemDAO.updateItemHitNum", itemDO);
	}



}
