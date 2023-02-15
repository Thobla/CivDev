package com.civ.sim;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import World.World;

public class CivSim extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	World world = new World();
	
	@Override
	public void create () {
		world.start();
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 0);
		world.update(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
