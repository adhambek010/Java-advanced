package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		
		display1(map);
		display2(map);
		display3(map);

	}

	private static void display1(Map<String, Integer> map) {
		
		for(String data : map.keySet()) {
			
			System.out.println("Key : "+data +"\tValue : "+map.get(data));
			
		}
		System.out.println();
	}
	
	private static void display2(Map<String, Integer> map) {
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println("Key : "+entry.getKey() +"\tValue : "+entry.getValue());
			
		}
		System.out.println();
	}
	
	private static void display3(Map<String, Integer> map) {
		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> temp = iterator.next();
			System.out.println("Key : "+temp.getKey() +"\tValue : "+temp.getValue());
		}
		
	}
}
