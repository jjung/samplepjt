package com.exam.junior.ssp;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String name;
	private String address;
	private String phone;
	
	
	
	
	public User(int id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof User)) {
			return false;
		}
		User u = (User)obj;
		return this.id == u.id && this.name.equals(u.name) && this.address.equals(u.address) && this.phone.equals(u.phone);
	}
	
	
}
