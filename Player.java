package game2_package;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject{
	Handler handler;
	Random r = new Random();
	public int locx = 0;
	public int locy = 0;
	private int timer = 10;
	
	public Player (int x, int y, ID2 id, Handler handler){
		super(x, y, id);
		this.handler = handler;
		locx = x;
		locy = y;
		
	}
	
	public void tick() {
		x += velX;
		x = Game.clamp(x, 0, Game.WIDTH - 37);
		if (timer <= 0){
			timer = 10;
			handler.addObject(new PlayerBullet(locx, locy, ID2.Player, handler));
		}
		else timer--;
    	
	}
	
	public void render(Graphics g) {
		
	}
}
