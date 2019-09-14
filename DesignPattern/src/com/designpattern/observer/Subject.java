package com.designpattern.observer;

public interface Subject {

	String getTitle();

	void subsCribe(Subscriber sb);

	void unSubsCribe(Observer sb);

	void notifySubsCriber();

	String getName();

	void setName(String name);

	void upload(String title);

}