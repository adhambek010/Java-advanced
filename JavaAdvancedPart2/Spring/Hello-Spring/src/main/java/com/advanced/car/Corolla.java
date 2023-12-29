package com.advanced.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.advanced.interfaces.Car;
import com.advanced.interfaces.Engine;

public class Corolla implements Car {

	@Autowired
	@Qualifier("v6Engine")
	Engine v6;
	
	@Override
	public void specs() {
		System.out.println("Sedan from Toyota with engine as : " + v6.specs());

	}

}
