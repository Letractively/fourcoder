package com.fly.biz.dao.item.impl;

import java.sql.SQLException;
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
		try {
			return this.getSqlMapClientTemplate().getSqlMapClient().queryForList("UserDAO.getAllItems",null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * �������ƻ�ȡ��Ʒ
	 * @param itemName
	 * @return
	 */
	public ItemDO getByItemName(String itemName) {
		 try {
			return (ItemDO)this.getSqlMapClientTemplate().getSqlMapClient().queryForObject("ItemDAO.getItemByName",itemName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ������ƷID��ȡ��Ʒ
	 * @param itemId
	 * @return
	 */
	public ItemDO getByItemId(String itemId) {
		try {
			return (ItemDO)this.getSqlMapClientTemplate().getSqlMapClient().queryForObject("ItemDAO.getItemById",itemId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ������Ʒ��Ϣ
	 * @param itemDO
	 */
	public void saveItem(ItemDO itemDO) {
		 try {
			this.getSqlMapClientTemplate().getSqlMapClient().insert("ItemDAO.insertItem",itemDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * ɾ����Ʒ��Ϣ
	 * @param itemId
	 */
	public void deleteItem(long itemId) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().delete("ItemDAO.deleteItem", itemId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * ������Ʒ��Ϣ
	 * @param itemDO
	 */
	public void updateItem(ItemDO itemDO) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().update("ItemDAO.updateItem", itemDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * ���·��������Ϣ
	 * @param itemDO
	 */
	public void updateItemShareNumber(ItemDO itemDO) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().update("ItemDAO.updateItemShareNum", itemDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * ���¶�������Ϣ
	 * @param itemDO
	 */
	public void updateItemHitnumber(ItemDO itemDO) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().update("ItemDAO.updateItemHitNum", itemDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
