package com.designpattern.composit.impl;

import com.designpattern.composit.Component;

public class Leaf implements Component{
	
	private String name;
	private int price;

	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		System.out.println("Name :" + name + " Price :" + price);
		
	}

}
