package btp600.game.facade;
import javax.swing.JFrame;


public class RunGame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RunGame() {
        add(new Scenario());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 700);
        setLocationRelativeTo(null);
        setTitle("Collision");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RunGame();
    }
}
