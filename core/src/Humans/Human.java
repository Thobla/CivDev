package Humans;

import com.badlogic.gdx.graphics.Texture;

import World.World;
import WorldObjects.House;

public class Human extends AbstractHuman{
	HumanStateInator stateInator = new HumanStateInator(this);
	
	
	public Human(House home, int birthYear, String birthMonth, World world) {
		super(home, birthYear, birthMonth, world);
	}


	@Override
	public void update() {
		stateInator.updateState();
	}
	
	
}
