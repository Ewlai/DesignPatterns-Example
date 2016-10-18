package btp600.game.strategy;

import java.awt.Image;

import javax.swing.ImageIcon;

public class BowAndArrow implements WeaponBehaviour{
	public Image image;
	
	public void useWeapon()
	{
		ImageIcon ii = new ImageIcon(this.getClass().getResource("bow.png"));
        image = ii.getImage();
		System.out.println("I am using bow and arrows!");
	}
	
	public Image getImage(){
		return image;
	}
}
