package com.ego.service;


import com.ego.pojo.EasyUIDataResult;
import com.ego.pojo.EgoResult;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;

public interface ItemService {
	
	TbItem getItemById(long itemId)throws Exception;
	
	EasyUIDataResult getAllItem(int page,int rows) throws Exception;

	EgoResult addItem(TbItem item, String desc,String itemParams);

	EgoResult deleteItem(String ids)throws Exception;

	EgoResult putaway(String ids)throws Exception;

	EgoResult reshelf(String ids) throws Exception;
	
	TbItemDesc getItemDescById(long itemId) throws Exception;
	
	
}
