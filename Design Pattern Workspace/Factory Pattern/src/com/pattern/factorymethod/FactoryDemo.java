package com.pattern.factorymethod;

public class FactoryDemo {

	public static void main(String[] args) {
		KnifeStore knifeStroe = new BudgetKnifeStore();
		
		Knife obj1 = knifeStroe.orderKnife("BC");
		Knife obj2 = knifeStroe.orderKnife("BS");
		
		knifeStroe = new QualityKnifeStore();
		Knife obj3 = knifeStroe.orderKnife("QC");
		
		
	}

}
