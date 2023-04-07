package Humans;

import com.badlogic.gdx.graphics.Texture;

import World.World;
import WorldObjects.House;

public abstract class AbstractFemale extends AbstractHuman implements IFemale  {

	AbstractFemale(House home, int birthYear, String birthMonth, World world) {
		super(home, birthYear, birthMonth, world);
	}
	public void update() {
		super.update();
	}

	

}
