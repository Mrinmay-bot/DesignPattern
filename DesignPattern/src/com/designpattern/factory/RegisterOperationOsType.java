package com.designpattern.factory;

public class RegisterOperationOsType {

	public OS getOsType(String osType) {
		if("ws".equals(osType)) {
			return new Windows();
		}else if("ios".equals(osType)) {
			return new Ios();
		}else if("andrd".equals(osType)) {
			return new Andriod();
		}		
		return null;
	}
	
}
