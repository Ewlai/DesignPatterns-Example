package btp600.game.character;
import javax.swing.ImageIcon;

import btp600.game.strategy.BowAndArrow;


public class Archer extends Character {
	public Archer()
	{
        ImageIcon ii = new ImageIcon(this.getClass().getResource("archer.png"));
        image = ii.getImage();
        width = image.getWidth(null);
        height = image.getHeight(null);
        visible = true;
        x = 40;
        y = 60;
		
		///////////////////////////////
		
		this.weapon = new BowAndArrow();
		healthPoints = 100;
		attackBase = 0;
		defense = 0;
		display();
		dx = 0;

	}
	
	public void display()
	{
		System.out.println("I am an archer and ");
		weapon.useWeapon();
	}
}
