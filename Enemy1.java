package game2_package;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy1 extends GameObject{
	private Handler handler;
	public Enemy1(int x, int y, ID2 id, Handler handler){
		super(x, y, id);
		this.handler = handler;
		velX = 0;
		velY = 5;
	}

	public Rectangle getBounds(){
        return new Rectangle((int) x,(int) y, 32, 32);
	}

	public void tick() {
		x += velX;
		y += velY;
		if (y >= Game.HEIGHT)handler.removeObject(this);
	}
	
	private void collision(){
		 for(int i = 0; i < handler.object.size(); i++){
	            GameObject tempObject = handler.object.get(i);
	            if(tempObject.getId2() == ID2.PlayerBullet){
	                            if(getBounds().intersects(tempObject.getBounds())){
	                            	handler.removeObject(this); 
	                            }
	                    }
	            }
	}

	public void render(Graphics g) {
	
		
	}
}
