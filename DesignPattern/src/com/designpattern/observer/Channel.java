package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private String name;
	private List<Subscriber> sb= new ArrayList<>();
	private String title;

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void subsCribe(Subscriber sb) {	
		this.sb.add(sb);
	}
	
	@Override
	public void unSubsCribe(Observer sb) {	
		this.sb.remove(sb);
		System.out.println("Subscriber :" + sb.getName() +" has unsubscribed your channel :" + name);
	}
	
	@Override
	public void  notifySubsCriber() {
		for(Observer sub :sb) {
			sub.upload();
		}
		
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void upload (String title) {
		this.title=title;
	}
}
