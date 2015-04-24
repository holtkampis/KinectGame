package game2_package;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput2 extends KeyAdapter{
	 private Handler handler;
     private boolean[] keyDown = new boolean[4];
     
     
     public KeyInput2(Handler handler){
             this.handler = handler;
             keyDown[0] = false;
             keyDown[1] = false;
     }
     public void keyPressed(KeyEvent e){
             int key = e.getKeyCode();      
             for(int i = 0; i < handler.object.size(); i++){
                     GameObject tempObject = handler.object.get(i);
                     if(tempObject.getId2() == ID2.Player){
                             if(key == KeyEvent.VK_D) { tempObject.setVelX2(5); keyDown[0] = true; }
                             if(key == KeyEvent.VK_A) { tempObject.setVelX2(-5); keyDown[1] = true; }
                     }
             }
             if(key == KeyEvent.VK_ESCAPE) System.exit(1);
     }
     public void keyReleased(KeyEvent e){
             int key = e.getKeyCode();      
             for(int i = 0; i < handler.object.size(); i++){
                     GameObject tempObject = handler.object.get(i);
                     if(tempObject.getId2() == ID2.Player){
                             if(key == KeyEvent.VK_D) tempObject.setVelX2(0);
                             if(key == KeyEvent.VK_A) tempObject.setVelX2(0);

                     }
             }
     }
}
