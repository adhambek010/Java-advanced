package com.java.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data<K extends Integer, V extends String> {

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

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	
}

public class ComparatorDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Comparator<Data<Integer, String>> comparator = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		};

		Set<Data<Integer, String>> set = new TreeSet<>(comparator);

		set.add(new Data(1, "One"));
		set.add(new Data(2, "Two"));
		set.add(new Data(3, "Three"));
		set.add(new Data(4, "Four"));
		set.add(new Data(5, "Five"));
		set.add(new Data(6, "Six"));
		set.add(new Data(7, "Seven"));
		
		for(Data data : set) {
			System.out.println(data);
		}
	}

}
