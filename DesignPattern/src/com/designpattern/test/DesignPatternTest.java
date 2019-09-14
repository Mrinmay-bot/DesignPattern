package com.designpattern.test;

import org.junit.Test;

import com.designpattern.composit.Component;
import com.designpattern.composit.impl.Composite;
import com.designpattern.composit.impl.Leaf;
import com.designpattern.prototype.BookShop;

public class DesignPatternTest {
	
	@Test
	public void testCompositDesignPattern() {
		Component hd=new Leaf("HDD", 30000);
		Component rm=new Leaf("RAM", 20000);
		Component moniter=new Leaf("MONITER", 70000);
		Component kb=new Leaf("KEYBOARD", 10000);
		Component cpu=new Leaf("CPU",10000);
		Component mouse=new Leaf("MOUSE",500);
		
		Composite mb=new Composite("MOETHERBOARD");
		Composite peri=new Composite("PERI");
		Composite cabinet=new Composite("CABINET");
		Composite computer=new Composite("COMPUTER");
		
		peri.addComponent(mouse);
		peri.addComponent(kb);
		peri.addComponent(moniter);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		mb.addComponent(rm);
		mb.addComponent(cpu);
		computer.addComponent(cabinet);
		computer.addComponent(peri);
		
		cabinet.showPrice();
	}
	
	@Test
	public void testPrototypeDesignPattern() throws CloneNotSupportedException {
		BookShop bsh1= new BookShop();
		bsh1.setShopName("Novelty");
		bsh1.loadBook();		
		BookShop bsh2=bsh1.clone();
		bsh2.setShopName("Jasper");
		bsh1.getB().remove(2);
		System.out.println("BookShop1 :" + bsh1);
		System.out.println("BookShop1 :" + bsh2);
		
		
	}

}
