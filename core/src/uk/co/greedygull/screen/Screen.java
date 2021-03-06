package uk.co.greedygull.screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * This is the abstract class inherited by all screens and provides the necessary methods
 * @author Matej
 *
 */
public abstract class Screen {

	public abstract void create();
	
	public abstract void update();
	
	public abstract void render(SpriteBatch sb);
	
	public abstract void resize(int width, int height);
	
	public abstract void dispose();
	
	public abstract void pause();
	
	public abstract void resume();
	
}
