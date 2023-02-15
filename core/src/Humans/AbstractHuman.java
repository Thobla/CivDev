package Humans;

import java.util.HashMap;

import com.badlogic.gdx.graphics.Texture;

import StaticData.StaticVariables;
import WorldObjects.House;

public abstract class AbstractHuman extends AbstractEntity{
	
	HashMap<String, Integer> birthDate = new HashMap<String, Integer>();
	//TODO finish birthDate
	
	private House home;
	public Texture texture;
	
	private int hunger;
	private int maxHunger = 100;
	
	private int energy;
	private int age;
	
	
	AbstractHuman(House home){
		this.home = home;
		
		this.posX = home.posX * StaticVariables.tileSize;
		this.posY = home.posY * StaticVariables.tileSize;
	}
	
	private void eat(int satiatingLevel) {
		if (hunger + satiatingLevel > maxHunger) { hunger = maxHunger; }
		else { hunger += satiatingLevel; }
	}
	
	
	
	public void update() {
	}
	
	
}
