package com.pattern.factory;

public class RocketEnemyShip extends EnemyShip {

	 
	public RocketEnemyShip()
	{
		setName("Rocket Enemy Ship");
		setAmtDamage(10.0);
	}

	@Override
	public EnemyShip buildShip(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
