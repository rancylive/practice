package com.rj.noonesbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.noonesbook.dao.ItemDao;
import com.rj.noonesbook.entity.ItemDTO;
import com.rj.noonesbook.vo.Item;

@Service
public class ItemService {

	@Autowired
	private ItemDao itemDao;
	
	public Item add(Item item) {
		ItemDTO itemDTO = new ItemDTO();
		
		itemDao.save(itemDTO);
		return item;
	}
}
