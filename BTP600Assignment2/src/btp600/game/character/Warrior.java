package btp600.game.character;

import btp600.game.strategy.Sword;


public class Warrior extends Character {
	public Warrior()
	{
		this.weapon = new Sword();
		healthPoints = 100;
		attackBase = 0;
		defense = 0;
		display();

	}
	
	public void display() 
	{
		System.out.println("I am a warrior and ");
		weapon.useWeapon();
	}
}
