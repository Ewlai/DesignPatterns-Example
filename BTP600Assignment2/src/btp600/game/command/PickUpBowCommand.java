package btp600.game.command;

public class PickUpBowCommand implements Command{
	   private PickUp pickup;
	   
	   public PickUpBowCommand(PickUp pick) {
	      this.pickup = pick;
	   }
	 
	   @Override    // Command
	   public void execute() {
	      pickup.switchBow();
	   }
}