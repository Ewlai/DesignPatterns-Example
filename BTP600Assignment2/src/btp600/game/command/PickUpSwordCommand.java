package btp600.game.command;

public class PickUpSwordCommand implements Command{
	   private PickUp pickup;
	   
	   public PickUpSwordCommand(PickUp pick) {
	      this.pickup = pick;
	   }
	 
	   @Override    // Command
	   public void execute() {
	      pickup.switchSword();
	   }

}
