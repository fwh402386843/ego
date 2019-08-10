package com.ego.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ego.mapper.TbItemCatMapper;
import com.ego.pojo.EasyUITreeNode;
import com.ego.pojo.TbItemCat;
import com.ego.pojo.TbItemCatExample;
import com.ego.pojo.TbItemCatExample.Criteria;
@Service
public class ItemCatServiceImpl implements ItemCatService{
	@Autowired
	private TbItemCatMapper catMapper;
	
	
	@Override
	public List<EasyUITreeNode> getItemCatList(Long parentId) throws Exception {
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = catMapper.selectByExample(example);
		List<EasyUITreeNode> nodes = new ArrayList<EasyUITreeNode>();
		for (TbItemCat tbItemCat : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent()?"closed":"open");
			nodes.add(node);
		}
		return nodes;
	}

}
