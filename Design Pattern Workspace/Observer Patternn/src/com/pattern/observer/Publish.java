package com.pattern.observer;

public class Publish {

	public static void main(String[] args) {
	
		Publisher publisher = new Publisher();
		@SuppressWarnings("unused")
		Subscriber subscriber1 = new Subscriber(publisher, "Subscirber 1");
		Subscriber subscriber2 = new Subscriber(publisher, "Subscirber 2");		
		Subscriber subscriber3 = new Subscriber("Subscirber 3");
		
		publisher.setPriceUpdate(0.0);
		publisher.setPriceUpdate(2.0);
		publisher.setPriceUpdate(5.0);
		
		publisher.unRegister(subscriber2);
		
		publisher.setPriceUpdate(10.0);
		publisher.setPriceUpdate(20.0);
		publisher.setPriceUpdate(50.0);
		
		publisher.register(subscriber3);
		
		publisher.setPriceUpdate(100.0);
		publisher.setPriceUpdate(200.0);
		publisher.setPriceUpdate(500.0);

	}

}
