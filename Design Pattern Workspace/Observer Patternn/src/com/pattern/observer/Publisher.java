package com.pattern.observer;

import java.util.ArrayList;

public class Publisher implements Subject {

	private ArrayList<Observer> subscibers ;
	private double priceUpdate;
	
	public Publisher()
	{
		subscibers  = new ArrayList<>();
	}
	
	@Override
	public void register(Observer newObserver) {
		subscibers.add(newObserver);
	}

	@Override
	public void unRegister(Observer removeObserver) {
		int indexof = subscibers.indexOf(removeObserver);
		subscibers.remove(indexof);
	}

	@Override
	public void notifiyObserver() {
		for( Observer observer : subscibers)
		{
			observer.update(priceUpdate);
		}

	}
	
	public void setPriceUpdate(double priceUpdate){
		this.priceUpdate = priceUpdate;
		notifiyObserver();
	}

}
