package com.pattern.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		EnemyShipFactory factory = new EnemyShipFactory();
		
		EnemyShip ship1= factory.buildShip("U");
		EnemyShip ship2= factory.buildShip("R");
		
		ship1.followHeroShip();		
		ship1.attackEnemyShip();
		ship2.attackEnemyShip();
	}

}
