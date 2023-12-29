package com.advanced.specs;

import com.advanced.interfaces.Engine;


public class EngineType implements Engine {

	String type;
	
	public EngineType() {
		this.type = "Unknown";
	}
	
	public EngineType(String type) {
		this.type = type;
	}
	
	@Override
	public String specs() {
		
		return type;
	}

}
