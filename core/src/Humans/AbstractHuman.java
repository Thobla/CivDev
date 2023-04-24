package Humans;

import java.util.HashMap;

import com.badlogic.gdx.graphics.Texture;

import StaticData.*;
import World.World;
import WorldObjects.House;
import WorldObjects.WorldObject;

public abstract class AbstractHuman extends AbstractEntity{
	
	private House home;
	
	private int fullness;
	private int maxFullness = 100;
	
	private HashMap<String, Integer> backpack = new HashMap<String, Integer>();
	
	private int moveSpeed = 3; //how many pixels to move each frame
	private int energy;
	private int birthYear;
	private String birthMonth;
	
	
	
	
	AbstractHuman(House home,int birthYear, String birthMonth, World world){
		super(home, birthYear, birthMonth, world);
		this.home = home;
		
		this.posX = home.posX * StaticVariables.tileSize;
		this.posY = home.posY * StaticVariables.tileSize;
		
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		
		for (String resource : StaticVariables.harvestableResources())
		backpack.put(resource, 0);
		
	}
	
	
	


	/**
	 * @param satiatingLevel - the amount of fullness it gives by eating
	 * the human eats gaining fullness
	 */
	private void eat(int satiatingLevel) {
		if (fullness + satiatingLevel > maxFullness) { fullness = maxFullness; }
		else { fullness += satiatingLevel; }
	}
	
	
	@Override
	public abstract void update();
	
	@Override
	public Texture getTexture() {
		return Textures.textureHuman;
		
	}
	
	
}
