package Humans;

import com.badlogic.gdx.graphics.Texture;

import World.World;
import WorldObjects.House;

public abstract class AbstractMale extends AbstractHuman implements IMale{
	
	
	
	
	AbstractMale(House home, int birthYear, String birthMonth, World world) {
		super(home, birthYear, birthMonth, world);
	}

	public void update(){
		super.update();
	}
	
	
	

}
