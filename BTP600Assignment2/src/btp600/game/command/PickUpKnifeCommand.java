package btp600.game.command;

public class PickUpKnifeCommand implements Command {
	   private PickUp pickup;
	   
	   public PickUpKnifeCommand(PickUp pick) {
	      this.pickup = pick;
	   }
	 
	   @Override    // Command
	   public void execute() {
	      pickup.switchKnife();
	   }
}
