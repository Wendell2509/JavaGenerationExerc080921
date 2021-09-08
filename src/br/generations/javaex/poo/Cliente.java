package br.generations.javaex.poo;

public class Cliente {

	String name="";
	int age=0;
	String type="";
	
	public Cliente(String name,int age,String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public void ShowInfo() {
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Type: " + type);
		
	}
	
	
}
