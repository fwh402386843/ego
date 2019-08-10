package com.ego.pojo;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class Item extends TbItem implements Serializable{
	
	public String[] getImages() {
		
		String string = this.getImage();
		if(StringUtils.isNotBlank(string)){
			String[] imgs = string.split(",");
			return imgs;
		}
		return null;
	}
	
	public Item(){}
	
	public Item(TbItem tbItem) {
		this.setBarcode(tbItem.getBarcode());
		this.setCid(tbItem.getCid());
		this.setCreated(tbItem.getCreated());
		this.setId(tbItem.getId());
		this.setImage(tbItem.getImage());
		this.setNum(tbItem.getNum());
		this.setPrice(tbItem.getPrice());
		this.setSellPoint(tbItem.getSellPoint());
		this.setStatus(tbItem.getStatus());
		this.setTitle(tbItem.getTitle());
		this.setUpdated(tbItem.getUpdated());
	}


}
