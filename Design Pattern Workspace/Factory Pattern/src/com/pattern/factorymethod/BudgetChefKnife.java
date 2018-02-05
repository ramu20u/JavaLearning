package com.pattern.factorymethod;

public class BudgetChefKnife implements Knife {

	@Override
	public void sahrpen() {
		System.out.println("Sharpen the budget chef knife");
	}

	@Override
	public void polish() {
		System.out.println("Polish the budget chef knife");
	}

}
