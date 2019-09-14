package com.designpattern.composit.impl;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.composit.Component;

public class Composite implements Component{

	private String name;
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	List<Component> c=new ArrayList<>();
	
	@Override
	public void showPrice() {
        for(Component cc:c) {
        	cc.showPrice();
        }
	}
	
	public void addComponent(Component com) {
		c.add(com);
	}

}
