package btp600.game.state;

import btp600.game.character.Character;

public  class JumpingState implements State{
 
 
	public String toString() {
		return " character is Jumpin!";
		
	}
	
	@Override
	public void doAction(Character character) {
		System.out.println("I am jumping!");
		character.setState(this);
		
	}
	
}
