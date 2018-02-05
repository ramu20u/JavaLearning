package com.pattern.factorymethod;

public abstract class KnifeStore {

	public Knife orderKnife(String knifeType){
		Knife knife;		
		knife = createKnife(knifeType);
		knife.sahrpen();
		knife.polish();
		return knife;
	}

	 abstract Knife createKnife(String knifeType) ;
}
