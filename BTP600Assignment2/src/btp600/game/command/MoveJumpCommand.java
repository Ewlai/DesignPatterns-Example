package btp600.game.command;

public class MoveJumpCommand implements Command {
	   private Movement movement;
	   
	   public MoveJumpCommand(Movement move) {
	      this.movement = move;
	   }
	 
	   @Override    // Command
	   public void execute() {
	      movement.moveJump();
	   }
}
