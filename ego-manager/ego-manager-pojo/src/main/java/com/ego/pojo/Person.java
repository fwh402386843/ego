package com.ego.pojo;


public class Person {
	
	private int id;
	private String name;
	private String sex;
	private Integer salary;
	
	
	public Person(int id, String name, String sex, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.salary = salary;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	} 

	
}
