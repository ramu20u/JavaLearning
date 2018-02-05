package com.pattern.observer;

public class Subscriber implements Observer {

	private double price;
	private String name;
	
	private Publisher publisher;
	
	public Subscriber(Publisher publisher, String name)
	{
		this.publisher = publisher;
		this.name = name;
		this.publisher.register(this);
	}
	
	public Subscriber(String name)
	{	
		this.name = name;
	}
	
	
	@Override
	public void update(double price) {
	this.price = price;
	printThePrices();

	}
	public void printThePrices(){
		        System.out.println("Name : " +name + ", Price : "+ price +"\n" );
	}

}
