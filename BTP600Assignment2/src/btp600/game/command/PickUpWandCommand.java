package btp600.game.command;

public class PickUpWandCommand implements Command{
	   private PickUp pickup;
	   
	   public PickUpWandCommand(PickUp pick) {
	      this.pickup = pick;
	   }
	 
	   @Override    // Command
	   public void execute() {
	      pickup.switchWand();
	   }
}