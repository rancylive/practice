package com.rj.noonesbook.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rj.noonesbook.vo.Item;

@RestController
@RequestMapping("/item/")
public class ItemController {

	@RequestMapping(value="add", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Item add(Item item) {
		return item;
	}
	
	@RequestMapping(value="update", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	public Item update(Item item) {
		return item;
	}
	
	@RequestMapping(value="search",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Item> search() {
		
		return null;
	}
	
	@RequestMapping(value="/{itemId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Item fetchItem() {
		return null;
	}
	
	@RequestMapping(value="/{itemId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Item delete() {
		return null;
	}
}
