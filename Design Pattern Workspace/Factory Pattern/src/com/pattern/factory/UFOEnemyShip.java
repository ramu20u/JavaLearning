package com.pattern.factory;

public class UFOEnemyShip extends EnemyShip {

	public UFOEnemyShip()
	{
		setName("UFO Enemy Ship");
		setAmtDamage(20.0);
	}

	@Override
	public EnemyShip buildShip(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
