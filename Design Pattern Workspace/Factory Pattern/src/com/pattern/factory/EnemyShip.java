package com.pattern.factory;

public abstract class EnemyShip {
	
	private String name;
	private double amtDamage;
	
	public void followHeroShip(){
		System.out.println(getName()+ " Following Hero Ship");
	}
	
	public void showEnemyShip(){
		System.out.println(getName()+ " Show Enemey Ship");
	}
	
	public void attackEnemyShip(){
		System.out.println(getName()+ " Attack Hero Ship");
		System.out.println(getName()+ " Damange to Hero Ship " + getAmtDamage());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmtDamage() {
		return amtDamage;
	}

	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	public abstract EnemyShip  buildShip(String type);

}
