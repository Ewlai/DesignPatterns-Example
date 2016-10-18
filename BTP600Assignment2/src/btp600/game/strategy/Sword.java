package btp600.game.strategy;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sword implements WeaponBehaviour {
	
	public Image image;
	
	public void useWeapon()
	{
		ImageIcon ii = new ImageIcon(this.getClass().getResource("sword.png"));
        image = ii.getImage();
		System.out.println("I am using a sword!");
	}
	
	public Image getImage(){
		return image;
	}
}
