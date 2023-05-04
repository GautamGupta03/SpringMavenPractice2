package com.spring;

public class Employee {
	private String name;
	private int id;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Employee() {
		System.out.println("def cons");
	}
	public Employee(int id) {
		this.id=id;
	}
	public Employee(String name) {
		this.name=name;
	}
	void show() {
		System.out.println(id +" "+name);
	}

}
