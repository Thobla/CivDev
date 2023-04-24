package WorldObjects;

import com.badlogic.gdx.graphics.Texture;

import StaticData.StaticVariables;
import StaticData.Textures;

public class GoldMine extends AbstractResourceSource{

	public GoldMine(int posX, int posY) {
		super(posX, posY);
		maxCapacity = StaticVariables.berryBushCapacity;
		remaining = maxCapacity;
	}

	@Override
	public Texture getTexture() {
		return Textures.textureMine;
	}

	@Override
	public String getName() {
		return "GoldMine";
	}

}
