package com.rj.noonesbook.dao;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.rj.noonesbook.entity.ItemDTO;

@Component
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
	
	public ItemDTO fetch(int itemId) {
		Criteria criteria = getSession().createCriteria(ItemDTO.class);
		criteria.add(Restrictions.eq("itemId", itemId));
		return (ItemDTO) criteria.uniqueResult();
	}
}
