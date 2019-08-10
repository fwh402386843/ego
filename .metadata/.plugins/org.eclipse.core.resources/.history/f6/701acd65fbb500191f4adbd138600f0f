package com.ego.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.pojo.EasyUITreeNode;
import com.ego.service.ItemCatService;

@Controller
public class ItemCatController {
	@Autowired
	private ItemCatService service;
	
	//商品种类查询
	@RequestMapping("item/cat/list")
	@ResponseBody
	public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id",defaultValue="0") Long parentId)throws Exception{
		List<EasyUITreeNode> list = service.getItemCatList(parentId);
		return list;
	} 
	
	

}
