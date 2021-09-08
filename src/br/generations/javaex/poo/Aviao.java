package br.generations.javaex.poo;

public class Aviao {

	String name = null;
	int capacity = 0;
	String company = null;

	public Aviao(String name,int capacity,String company) {
		this.name = name;
		this.capacity = capacity;
		this.company = company;
	}
	
	public void ShowInfo() {
		
		System.out.println("Name: " + name);
		System.out.println("Capacity: " + capacity);
		System.out.println("Company: " + company);
		
	}

}
