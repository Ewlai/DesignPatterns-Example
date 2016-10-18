package btp600.game.character;

import javax.swing.ImageIcon;

import btp600.game.strategy.Knife;


public class Thief extends Character {
	public Thief()
	{
        ImageIcon ii = new ImageIcon(this.getClass().getResource("bluethief.png"));
        image = ii.getImage();
        width = image.getWidth(null);
        height = image.getHeight(null);
        visible = true;
        x = 40;
        y = 400;
		
        
		this.weapon = new Knife();
		healthPoints = 100;
		attackBase = 0;
		defense = 0;
		display();
	}
	
	public void display()
	{
		System.out.println("I am a thief and ");
		weapon.useWeapon();
	}
}
