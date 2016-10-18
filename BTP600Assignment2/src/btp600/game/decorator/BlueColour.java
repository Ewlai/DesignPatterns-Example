package btp600.game.decorator;

import javax.swing.ImageIcon;

import btp600.game.character.Character;

public class BlueColour extends CharacterDecorator {
	Character character;
	
	public BlueColour(Character character) {
		this.character = character;
		draw();
	}
	
	@Override
	public void draw() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource("bluethief.png"));
		image = ii.getImage();
		width = character.image.getWidth(null);
		height = character.image.getHeight(null);
		visible = true;
		x = 40;
		y = 400;
	}

	@Override
	public void display() {
		System.out.println("My clothing colour is BLUE!");
	}
}
