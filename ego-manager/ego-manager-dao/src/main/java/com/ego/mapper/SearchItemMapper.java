package com.ego.mapper;

import java.util.List;

import com.ego.pojo.SearchItem;

public interface SearchItemMapper {
	
	List<SearchItem> getItemList() throws Exception;
	
	SearchItem getItemById(Long id) throws Exception;

}
