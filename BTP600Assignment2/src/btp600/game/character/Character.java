package btp600.game.character;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import btp600.game.command.*;
import btp600.game.state.JumpingState;
import btp600.game.state.RunningState;
import btp600.game.state.StandingState;
import btp600.game.state.State;
import btp600.game.strategy.WeaponBehaviour;

public abstract class Character {
	public WeaponBehaviour weapon;
    public int dx;
    public int dy;
    public int x;
    public int y;
    public int width;
    public int height;
    public boolean visible;
    public Image image;
	public int healthPoints;
	public int attackBase;
	public int defense;
	State state;
	Movement moveCharacter;
	PickUp switchWeapon;
	
	//Command classes
	public Character()
	{
		moveCharacter = new Movement(this);
		switchWeapon = new PickUp(this);
		state = null;
		
	}
	
	public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	
	public void setWeapon(WeaponBehaviour w)
	{
		this.weapon = w;
	}
	
    public void move() {

        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 300) {
        	dy= 1;
        }
        
        if(y > 400){
        	dy = 0;
        }
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public void keyPressed(KeyEvent e) {
    	
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            moveCharacter.moveLeft();
            state = new RunningState();
            state.doAction(this);
        }

        if (key == KeyEvent.VK_RIGHT) {
        	moveCharacter.moveRight();
        	state = new RunningState();
            state.doAction(this);
        }
        
        if (key == KeyEvent.VK_SPACE) {
        	moveCharacter.moveJump();
        	state = new JumpingState();
            state.doAction(this);
        }
        
        if (key == KeyEvent.VK_S) {
        	switchWeapon.switchSword();
        }
        
        if (key == KeyEvent.VK_K) {
        	switchWeapon.switchKnife();
        }
        
        if (key == KeyEvent.VK_B) {
        	switchWeapon.switchBow();
        }
        
        if (key == KeyEvent.VK_W) {
        	switchWeapon.switchWand();
        }

    }
    
    public void keyReleased(KeyEvent e) {
    	
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            moveCharacter.moveLeftRelease();
        }

        else if (key == KeyEvent.VK_RIGHT) {
            moveCharacter.moveRightRelease();
        }
        else
        {
        	state = new StandingState();
            state.doAction(this);
        }
    }
	
	public abstract void display();
	
	
}
