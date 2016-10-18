package btp600.game.decorator;

import javax.swing.ImageIcon;

import btp600.game.character.Character;

public class GreenColour extends CharacterDecorator {
	Character character;
	
	public GreenColour(Character myChar) {
		character = myChar;
		draw();
	}
	
	@Override
	public void draw() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource("greenthief.png"));
		image = ii.getImage();
		width = character.image.getWidth(null);
		height = character.image.getHeight(null);
		visible = true;
		x = 40;
		y = 400;
	}
	
	@Override
	public void display() {
		System.out.println("My clothing colour is GREEN!");
	}
}
