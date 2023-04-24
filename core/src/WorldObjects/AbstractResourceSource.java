package WorldObjects;

import com.badlogic.gdx.graphics.Texture;

public abstract class AbstractResourceSource extends WorldObject{
	
	protected int maxCapacity;
	protected int remaining;
	protected boolean notEmpty;
	
	AbstractResourceSource(int posX, int posY) {
		super(posX, posY);
	}
	
	public int getRemaining() {
		return remaining;
	}
	
	
	/**
	 * @param amount - amount of resource to harvest
	 * reduces remaining resources by amount
	 * @return - the amount of resources harvested (either amount or remaining)
	 */
	public int harvest(int amount) {
		if (amount >= remaining) {
			int beforeHarvest = remaining;
			remaining = 0;
			notEmpty = false;
			return beforeHarvest;
		}
		else {
			remaining -= amount;
			return amount;
		}
		
	}


	
	
}
