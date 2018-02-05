package com.pattern.factory;

public class EnemyShipFactory {
	
	public EnemyShip buildShip(String typeOfShip)
	{
		EnemyShip ship = null;
		if(typeOfShip.equals("U"))
			ship = new UFOEnemyShip();
		else if(typeOfShip.equals("R"))
			ship=  new RocketEnemyShip();
		
			return ship;
	}

}
