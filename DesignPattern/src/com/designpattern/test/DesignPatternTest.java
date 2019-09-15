package com.designpattern.test;

import org.junit.Test;

import com.designpattern.adapter.Pen;
import com.designpattern.adapter.PenMarker;
import com.designpattern.composit.Component;
import com.designpattern.composit.impl.Composite;
import com.designpattern.composit.impl.Leaf;
import com.designpattern.factory.OS;
import com.designpattern.factory.RegisterOperationOsType;
import com.designpattern.observer.Channel;
import com.designpattern.observer.Subject;
import com.designpattern.observer.Subscriber;
import com.designpattern.prototype.BookShop;
import com.designpattern.singleton.Abc;

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
	
	 @Test
	 public void testObserverDesignPattern() {
		 Subscriber sb1= new Subscriber("Akshay");
		 Subscriber sb2= new Subscriber("Sunil");
		 Subscriber sb3= new Subscriber("Vibhav");
		 Subscriber sb4= new Subscriber("Ajay");
		 Subscriber sb5= new Subscriber("Ratnesh");

		 
		 Subject ch1=new Channel();
		 ch1.setName("Learn Java by Mrinmay");
		 ch1.subsCribe(sb1);
		 ch1.subsCribe(sb2);
		 ch1.subsCribe(sb3);
		 ch1.subsCribe(sb4);
		 ch1.subsCribe(sb5);
		 
		 sb1.subscribeChannel(ch1);
		 sb2.subscribeChannel(ch1);
		 sb3.subscribeChannel(ch1);
		 sb4.subscribeChannel(ch1);
		 sb5.subscribeChannel(ch1);

		 ch1.unSubsCribe(sb3);
		 System.out.println("\n");
		 ch1.upload("How to learn Spring Boot programming??");
		 
		 ch1.notifySubsCriber(); 
		 
	 }
	 
	 @Test
	 public void testAdapterDesignPattern() {
		 Pen p=new PenMarker();
		 p.startWritingAssignMentUsingPen();
	 }
	 
	 
	 @Test
	 public void testFactoryDesignPattern() {
        RegisterOperationOsType rostp=new RegisterOperationOsType();
        OS os=rostp.getOsType("ios");
        os.spec();
	 }
	 
	 @Test
	 public void testSingletonDesignPattern() {
		 Abc ob=Abc.getInstance();
		 System.out.println("Object for SingletonDesignPattern :" + ob);
	 }
}
