package com.rj.noonesbook.dao;

import javax.transaction.Transactional;

import com.rj.noonesbook.entity.ItemDTO;

@Transactional	//(rollbackOn=Exception.class)
public class ItemDao extends AbstractDao {
	
	public ItemDTO save(ItemDTO itemDTO) {
		return (ItemDTO) getSession().save(itemDTO);
	}
	
	public void update(ItemDTO itemDTO) {
		getSession().update(itemDTO);
	}
	
	public void delete(ItemDTO itemDTO) {
		getSession().delete(itemDTO);
	}
}
