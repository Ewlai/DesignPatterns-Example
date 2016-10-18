package btp600.game.command;

import btp600.game.character.Character;

public class InvokeMovement {
	Command left;
	Command right;
	Command jump;
	
	public InvokeMovement(Character myChar){
		right = new MoveRightCommand(new Movement(myChar));
		left = new MoveLeftCommand(new Movement(myChar));
		jump = new MoveJumpCommand(new Movement(myChar));
	}
	
}
