package com.ego.service;

import java.util.List;

import com.ego.pojo.EasyUITreeNode;

public interface ItemCatService {
	
	List<EasyUITreeNode> getItemCatList(Long parentId)throws Exception;

}