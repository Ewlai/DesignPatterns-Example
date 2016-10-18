package btp600.game.character;

import btp600.game.strategy.Wand;


public class Mage extends Character {
	
	public Mage()
	{
		weapon = new Wand();
		healthPoints = 100;
		attackBase = 0;
		defense = 0;
		display();
	}
	
	
	public void display()
	{
		System.out.println("I am a mage and ");
		weapon.useWeapon();
	}
}
