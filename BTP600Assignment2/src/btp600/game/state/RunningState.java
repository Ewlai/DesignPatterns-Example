package btp600.game.state;

import btp600.game.character.Character;

public class RunningState implements State {
	
	@Override
	public void doAction(Character character) {
		System.out.println("I am running!");
		character.setState(this);
		
	}
	
	public String toString() {
		return "Running";
	}

	
}
