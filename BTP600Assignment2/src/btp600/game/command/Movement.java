package btp600.game.command;

import btp600.game.character.Character;


/** The Receiver class */
public class Movement{
	public Character myChar;
	
	public Movement(Character c)
	{
		myChar = c;
	}
 
   public void moveLeft() {
      myChar.dx = -1;
   }
 
   public void moveRight() {
	   myChar.dx = 1;
   }
   
   public void moveLeftRelease() {
	      myChar.dx = 0;
		  System.out.println("you have moved left");
	   }
	 
   public void moveRightRelease() {
		   myChar.dx = 0;
	      System.out.println("you have moved right");
  }
   
   public void moveJump() {
	   myChar.dy = -1;
	   System.out.println("jumping");
   }

   public void display()
	{
		
	}
}