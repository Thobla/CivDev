package WorldObjects;

public abstract class AbstractRenewableSource extends AbstractResourceSource{
	AbstractRenewableSource(int posX, int posY) {
		super(posX, posY);
	}

	protected double growRate; //grows 10% each time it grows
	protected double notEmptyLevel; //level at which we change state of forest to notEmpty
	protected double actualRemaining = remaining;

	/**
	 * makes the forest grow at the given grow rate, and changing notEmpty state to true if it reaches notEmptyLevel
	 */
	protected void grow() {
		actualRemaining += growRate*maxCapacity;
		if (remaining + Math.floor(actualRemaining) >= maxCapacity) {
			remaining = maxCapacity;
		}
		else {
			remaining = (int) Math.floor(actualRemaining);
			if (remaining >= (int) Math.floor(notEmptyLevel * maxCapacity)){
				notEmpty = true;
			}
		}
	}
	@Override
	public int harvest(int amount){
		if (amount >= remaining) {
			actualRemaining = 0;
		}
		else {
			actualRemaining -= amount;
		}
		return super.harvest(amount);
	}
	
	public double getActualRemaining() {
		return actualRemaining;
	}
	
}
