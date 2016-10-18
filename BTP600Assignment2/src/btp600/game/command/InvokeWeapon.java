package btp600.game.command;
import btp600.game.character.Character;

public class InvokeWeapon {
	Command sword;
	Command wand;
	Command knife;
	Command bow;
	
	public InvokeWeapon(Character myChar){
		sword = new MoveRightCommand(new Movement(myChar));
		wand = new MoveLeftCommand(new Movement(myChar));
		knife = new MoveJumpCommand(new Movement(myChar));
		bow = new MoveJumpCommand(new Movement(myChar));
	}
}
