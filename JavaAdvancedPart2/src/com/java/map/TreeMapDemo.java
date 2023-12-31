package com.java.map;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparator<Code>{
	
	private String sectionNo;
	private String lectureNo;
	
	public Code() {}
	
	
	public Code(String sectionNo, String lectureNo) {
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	/**
	 * @return the sectionNo
	 */
	public String getSectionNo() {
		return sectionNo;
	}

	/**
	 * @return the lectureNo
	 */
	public String getLectureNo() {
		return lectureNo;
	}

	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

	@Override
	public int compare(Code obj1, Code obj2) {
		
		return obj1.getLectureNo().compareTo(obj2.getLectureNo());
	}

}

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Code, String> map = new TreeMap<Code, String>(new Code());
		
		map.put(new Code("S11", "22"), "Jamshid");
		map.put(new Code("S12", "24"), "Diyor");
		map.put(new Code("S14", "34"), "Jamol");
		map.put(new Code("S17", "65"), "Asom");
		map.put(new Code("S18", "98"), "Aziz");
		
		System.out.println(map);
		

	}

}
