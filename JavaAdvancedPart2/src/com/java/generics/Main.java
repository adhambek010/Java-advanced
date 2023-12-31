package com.java.generics;

import java.util.LinkedList;
import java.util.List;

class Vehicle{
	
	private int id;
	
	public Vehicle(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + "]";
	}
	
}

class Car extends Vehicle{

	private String model;
	
	public Car(int id, String model) {
		super(id);
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]" + super.toString();
	}
	
}

public class Main {

	public static void main(String[] args) {
		List<Vehicle> list = new LinkedList<>();
		
		list.add(new Vehicle(1));
		list.add(new Vehicle(2));
		list.add(new Vehicle(3));
		list.add(new Vehicle(4));
		list.add(new Vehicle(5));
		list.add(new Car(6, "Toyota"));

		display(list);
		display2(list);
	}
	
	private static void display(List<? extends Vehicle> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	private static void display2(List<? super Vehicle> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}

	}
}
