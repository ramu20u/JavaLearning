package com.pattern.factorymethod;

public class BudgetSteakKnife implements Knife {

	@Override
	public void sahrpen() {
		System.out.println("Sharpen the steak knife");

	}

	@Override
	public void polish() {
		System.out.println("Polish the steak knife");

	}

}
