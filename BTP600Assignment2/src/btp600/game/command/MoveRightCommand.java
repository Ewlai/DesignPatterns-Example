package btp600.game.command;

public class MoveRightCommand implements Command {
	   private Movement movement;
	   
	   public MoveRightCommand(Movement move) {
	      this.movement = move;
	   }
	 
	   @Override    // Command
	   public void execute() {
	      movement.moveRight();
	   }
}
