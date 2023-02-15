package Humans;

import com.badlogic.gdx.graphics.Texture;

import WorldObjects.House;

public abstract class AbstractMale extends AbstractHuman implements IMale{
	
	Texture texture = new Texture("house.jpg");
	
	AbstractMale(House home) {
		super(home);
		this.texture = new Texture("house.jpg");
		
		// TODO Auto-generated constructor stub
	}
	public void update(){
		posX += 1;
	}
	

}
