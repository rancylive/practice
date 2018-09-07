package com.rj.noonesbook.entity;

import javax.persistence.*;

@Entity(name = "PERSON")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int personId;
	@Column(name = "name")
	String name;
	@OneToMany(mappedBy = "person")
	ItemDTO itemDTO;
	@OneToMany
	@JoinColumn(name = "address")
	Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return personId;
	}

	public void setId(int id) {
		this.personId = id;
	}

	public ItemDTO getItem() {
		return itemDTO;
	}

	public void setItem(ItemDTO itemDTO) {
		this.itemDTO = itemDTO;
	}
}
