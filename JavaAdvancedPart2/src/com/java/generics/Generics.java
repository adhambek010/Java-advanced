package com.java.generics;

class Data<K, V extends Name> {

	private K key;
	private V value;

	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public <N extends Number, E> void display(N number, E element) {
		System.out.println("Number : " + number + "\tElement : " + element);
	}
}

class Name{
	private String name;

	public Name(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
	
	
	
}

public class Generics {
	public static void main(String[] args) {
		Data<Integer, Name> data1 = new Data<>(1, new Name("Kitten"));
		data1.display(25, '%');
	}

}
