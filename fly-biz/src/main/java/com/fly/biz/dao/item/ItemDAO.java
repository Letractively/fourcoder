package com.fly.biz.dao.item;

import java.util.List;

import com.fly.biz.common.model.item.ItemDO;



public interface ItemDAO {

	/**
	 * ��ȡ������Ʒ��Ϣ
	 * @return
	 */
	public List<ItemDO> getItemList();
	
	/**
	 * �������ƻ�ȡ��Ʒ
	 * @param itemName
	 * @return
	 */
	public ItemDO getByItemName(String itemName);
	
	/**
	 * ������ƷID��ȡ��Ʒ
	 * @param itemId
	 * @return
	 */
	public ItemDO getByItemId(String itemId);
	
	/**
	 * ������Ʒ��Ϣ
	 * @param itemDO
	 */
	public void saveItem(ItemDO itemDO);
	
	/**
	 * ɾ����Ʒ��Ϣ
	 * @param itemId
	 */
	public void deleteItem(long itemId);
	
	/**
	 * ������Ʒ��Ϣ
	 * @param itemDO
	 */
	public void updateItem(ItemDO itemDO);
	
	/**
	 * ���·��������Ϣ
	 * @param itemDO
	 */
	public void updateItemShareNumber(ItemDO itemDO);
	
	/**
	 * ���¶�������Ϣ
	 * @param itemDO
	 */
	public void updateItemHitnumber(ItemDO itemDO);
}
