package btp600.game.facade;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import btp600.game.character.Character;
import btp600.game.character.Thief;
import btp600.game.decorator.BlueColour;
import btp600.game.decorator.GreenColour;

public class Scenario extends JPanel implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timer timer;
    Character character;
    private boolean ingame;
    private int B_WIDTH;
    private int B_HEIGHT;
    Image img;

    public Scenario() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        ImageIcon ii = new ImageIcon(this.getClass().getResource("rain_big.gif"));
       
        img = ii.getImage();
        
        //setBackground(Color.BLACK);
        //setBounds
        setDoubleBuffered(true);
        ingame = true;

        setSize(1500, 700);
      
        // Implementation of decorator
        
        String color = "";
        int exit = 0;
        Scanner in = new Scanner(System.in);
        
        // Implementation of decorator
        while (exit == 0){
	        System.out.println("Type blue or green to choose the color of your clothes:");
			color = in.nextLine();
	        System.out.println(color);
	        if (color.equalsIgnoreCase("blue")){
	        	character = new BlueColour(new Thief());
	        	exit = 1;
	        } 
	        
	        if (color.equalsIgnoreCase("green")){
	        	character = new GreenColour(new Thief());
	        	exit = 1;
	        }
        }
        
        in.close();     
		
        timer = new Timer(5, this);
        timer.start();
    }

    public void addNotify() {
        super.addNotify();
        B_WIDTH = getWidth();
        B_HEIGHT = getHeight();   
    }

    public void paint(Graphics g) {
        super.paint(g);
        //g.drawImage(img, 0, 0, null);
        
        if (ingame) {
        	
            Graphics2D g2d = (Graphics2D)g;
            g.drawImage(img, 0, 0 , null);
            if (character.isVisible()){
                g2d.drawImage(character.getImage(), character.getX(), character.getY(), this);
                g2d.drawImage(character.weapon.getImage(), character.getX() + 130, character.getY() + 50, this);
            }
            //g.drawImage(img, 0, 0, null);
           //g2d.setColor(Color.WHITE);



        Toolkit.getDefaultToolkit().sync();
        g.dispose();
        }
    }


    public void actionPerformed(ActionEvent e) {

        character.move();
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            character.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            character.keyPressed(e);
        }
    }
}