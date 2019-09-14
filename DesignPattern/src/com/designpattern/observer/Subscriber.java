package com.designpattern.observer;

public class Subscriber implements Observer {

	public String name;

	private Subject channel= new Channel();

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	@Override
	public void upload() {
		System.out.println("Hey "+ name + ",vedio uploaded  for channel :" + channel.getName() +  "  with new vedio for :" + channel.getTitle() );

	}

	@Override
	public void subscribeChannel(Subject ch) {
		this.channel=ch;
	}

}
