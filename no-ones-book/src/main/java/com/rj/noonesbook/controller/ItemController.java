package com.rj.noonesbook.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rj.noonesbook.services.ItemService;
import com.rj.noonesbook.vo.Item;

@RestController
@RequestMapping("/item/")
public class ItemController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="add", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Item add(Item item) {
		LOGGER.info("Saving [item: {}]",item);
		return itemService.add(item);
	}
	
	@RequestMapping(value="update", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	public Item update(Item item) {
		LOGGER.info("Updating [item: {}]",item);
		return itemService.add(item);
	}
	
	@RequestMapping(value="search",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Item> search() {
		
		return null;
	}
	
	@RequestMapping(value="/{itemId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Item fetchItem(@PathVariable int itemId) {
		LOGGER.info("Fetching [itemId: {}]",itemId);
		return itemService.fetch(itemId);
	}
	
	@RequestMapping(value="/{itemId}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Item delete() {
		return null;
	}
}
