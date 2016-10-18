package btp600.game.decorator;

import btp600.game.character.Thief;

public abstract class CharacterDecorator extends Thief {
	
	public void setColour(CharacterDecorator colour)
	{
		colour.display();
	}	
	
	public abstract void draw();
	
	public abstract void display();
}
