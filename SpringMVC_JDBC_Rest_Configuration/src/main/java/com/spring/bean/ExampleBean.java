package com.spring.bean;

public class ExampleBean {
	
	private int id;
	private String name;
	private String desc;
	
	
	public ExampleBean(int id, String name, String desc) {
		super();
		this.setId(id);
		this.name = name;
		this.desc = desc;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	

}
