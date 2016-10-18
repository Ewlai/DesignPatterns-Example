package btp600.game.command;
import btp600.game.character.Character;
import btp600.game.strategy.*;

/** The Receiver class */
public class PickUp {
	Character myChar;
	
	public PickUp(Character c)
	{
		myChar = c;
	}
	
	public void switchKnife() {
	      myChar.weapon = new Knife();
	      System.out.println("picked up a knife");
	      myChar.weapon.useWeapon();
	}
	
	public void switchWand() {
	      myChar.weapon = new Wand();
	      System.out.println("picked up a wand");
	      myChar.weapon.useWeapon();
	}
	
	public void switchBow() {
	      myChar.weapon = new BowAndArrow();
	      System.out.println("picked up a bow and arrow");
	      myChar.weapon.useWeapon();
	}
	
	public void switchSword() {
	      myChar.weapon = new Sword();
	      System.out.println("picked up a sword");
	      myChar.weapon.useWeapon();
	}
	
	public void display()
	{
		
	}
}