package btp600.game.command;

public class MoveLeftCommand implements Command {
	   private Movement movement;
	   
	   public MoveLeftCommand(Movement move) {
	      this.movement = move;
	   }
	 
	   @Override    // Command
	   public void execute() {
	      movement.moveLeft();
	   }
}
