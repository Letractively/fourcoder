package com.fly.biz.common.model.result;

import com.fly.biz.common.model.item.ItemDO;


public class ItemResultDO extends ResultDO<ItemDO>{

	public ItemResultDO(){
		
	}
	
	public ItemResultDO(boolean isSuccess){
		super(isSuccess);
	}
}
