package com.pattern.factorymethod;

public class QualityKnifeStore extends KnifeStore {

	@Override
	Knife createKnife(String knifeType) {
		Knife knife = null;
		if(knifeType.equals("QC"))
			knife = new QualityChefKnife();
		else if (knifeType.equals("QS"))
			knife = new QualitySteakKnife();
		
		return knife;
	}
}
