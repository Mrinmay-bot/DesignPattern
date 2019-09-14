package com.designpattern.test;

import org.junit.Test;

import com.designpattern.composit.Component;
import com.designpattern.composit.impl.Composite;
import com.designpattern.composit.impl.Leaf;

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

}
