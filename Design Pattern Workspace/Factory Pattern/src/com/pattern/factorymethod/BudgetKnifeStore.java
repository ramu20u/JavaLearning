package com.pattern.factorymethod;

public class BudgetKnifeStore extends KnifeStore {

	//This is the factory Method
	@Override
	Knife createKnife(String knifeType) {
		Knife knife = null;
		if(knifeType.equals("BC"))
			knife = new BudgetChefKnife();
		else if (knifeType.equals("BS"))
			knife = new BudgetSteakKnife();
		
		return knife;
	}

}
