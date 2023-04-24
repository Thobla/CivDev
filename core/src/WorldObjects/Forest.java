package WorldObjects;

import com.badlogic.gdx.graphics.Texture;

import StaticData.StaticVariables;
import StaticData.Textures;

/**
 * @author thorg
 * A forest, a renewable resource that gives wood when chopped by a player.
 */
public class Forest extends AbstractRenewableSource{

	public Forest(int posX, int posY) {
		super(posX, posY);
		maxCapacity = StaticVariables.berryBushCapacity;
		remaining = maxCapacity;
		growRate = StaticVariables.forestGrowRate;
	}

	private double notEmptyLevel = 0.2; //level at which we change state of forest to notEmpty
	private double actualRemaining = remaining;
	
	
	public void update() {
		grow();
	}

	@Override
	public Texture getTexture() {
		return Textures.textureForest;
	}

	@Override
	public String getName() {
		return "Forest";
	}
	
	
}
