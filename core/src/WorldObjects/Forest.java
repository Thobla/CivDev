package WorldObjects;

import com.badlogic.gdx.graphics.Texture;

import StaticData.Textures;

/**
 * @author thorg
 *
 */
public class Forest extends AbstractRenewableSource{

	public Forest(int posX, int posY) {
		super(posX, posY);
	}

	private double growRate = 0.01; //grows 10% each time it grows
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
