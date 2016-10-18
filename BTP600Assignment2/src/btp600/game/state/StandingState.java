package btp600.game.state;

import btp600.game.character.Character;

public  class StandingState implements State {
	
	public String toString() {
		return "standing";
		
	}

	@Override
	public void doAction(Character character) {
		System.out.println("I am standing now!");
		character.setState(this);
		
	}

}
