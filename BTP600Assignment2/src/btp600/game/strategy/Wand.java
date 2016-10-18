package btp600.game.strategy;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Wand implements WeaponBehaviour {
	public Image image;
	
	public void useWeapon()
	{
		ImageIcon ii = new ImageIcon(this.getClass().getResource("wand.png"));
        image = ii.getImage();
		System.out.println("I am using a wand!");
	}
	
	public Image getImage(){
		return image;
	}
}
