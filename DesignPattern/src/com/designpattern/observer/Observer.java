package com.designpattern.observer;

public interface Observer {

	void upload();

	void subscribeChannel(Subject ch);
	String getName();

}