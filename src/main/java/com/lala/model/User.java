package com.lala.model;

public class User 
{
	private Integer id;
	private String name;
	private String desc;
	
	public Integer getId() 
	{
		return id;
	}
	public void setId(Integer id) 
	{
		this.id = id;
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
	public String toString()
	{
		return "[id="+id+",name="+name+",desc="+desc+"]";
	}
}
