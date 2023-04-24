package WorldObjects;

import com.badlogic.gdx.graphics.Texture;

import StaticData.Textures;
import StaticData.StaticVariables;

public class BerryBush extends AbstractRenewableSource{

	public BerryBush(int posX, int posY) {
		
		super(posX, posY);
		maxCapacity = StaticVariables.berryBushCapacity;
		remaining = maxCapacity;
		growRate = StaticVariables.berryGrowRate;
	}
	
	private double notEmptyLevel = 0.2; //level at which we change state of forest to notEmpty
	private double actualRemaining = remaining;
	
	public void update() {
		grow();
	}

	@Override
	public Texture getTexture() {
		return Textures.textureBush;
	}

	@Override
	public String getName() {
		return "BerryBush";
	}
	
	
}
