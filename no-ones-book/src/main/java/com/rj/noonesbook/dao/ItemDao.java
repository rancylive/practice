package com.rj.noonesbook.dao;

import javax.transaction.Transactional;

import com.rj.noonesbook.entity.Item;

@Transactional	//(rollbackOn=Exception.class)
public class ItemDao extends AbstractDao {
	
	public Item save(Item item) {
		return (Item) getSession().save(item);
	}
}
