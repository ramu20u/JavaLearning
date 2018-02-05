package com.pattern.statergy;

public interface Flys {
	
	String fly();

}


class ItFlys implements Flys{

	@Override
	public String fly() {
		return "Fly High!";
	}
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		return "I can't Fly :(";
	}
	
}