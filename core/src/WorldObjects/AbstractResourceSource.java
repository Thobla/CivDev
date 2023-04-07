package WorldObjects;

import com.badlogic.gdx.graphics.Texture;

public abstract class AbstractResourceSource extends WorldObject{
	
	AbstractResourceSource(int posX, int posY) {
		super(posX, posY);
	}


	protected int maxCapacity;
	protected int remaining;
	protected boolean notEmpty;
	
	
	/**
	 * @param amount - amount of resource to harvest
	 * reduces remaining resources by amount
	 * @return - the amount of resources harvested (either amount or remaining)
	 */
	public int harvest(int amount) {
		if (amount >= remaining) {
			System.out.println("harvesting");
			remaining = 0;
			notEmpty = false;
			return remaining;
		}
		else {
			remaining -= amount;
			return amount;
		}
		
	}


	
	
}
