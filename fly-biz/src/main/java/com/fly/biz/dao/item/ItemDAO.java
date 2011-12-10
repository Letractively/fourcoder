package com.fly.biz.dao.item;

import java.util.List;

import com.fly.biz.common.model.item.ItemDO;



public interface ItemDAO {

	/**
	 * 获取所有商品信息
	 * @return
	 */
	public List<ItemDO> getItemList();
	
	/**
	 * 根据名称获取商品
	 * @param itemName
	 * @return
	 */
	public ItemDO getByItemName(String itemName);
	
	/**
	 * 根据商品ID获取商品
	 * @param itemId
	 * @return
	 */
	public ItemDO getByItemId(String itemId);
	
	/**
	 * 保存商品信息
	 * @param itemDO
	 */
	public void saveItem(ItemDO itemDO);
	
	/**
	 * 删除商品信息
	 * @param itemId
	 */
	public void deleteItem(long itemId);
	
	/**
	 * 更新商品信息
	 * @param itemDO
	 */
	public void updateItem(ItemDO itemDO);
	
	/**
	 * 更新分享次数信息
	 * @param itemDO
	 */
	public void updateItemShareNumber(ItemDO itemDO);
	
	/**
	 * 更新对象点击信息
	 * @param itemDO
	 */
	public void updateItemHitnumber(ItemDO itemDO);
}
