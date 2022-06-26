package main;
import javax.swing.JPanel;
import inputs.KeyBoardInput;
import utils.Vector2d;

import java.awt.Graphics;
public class GamePanel extends JPanel {
    private Vector2d vel=new Vector2d(0.0f, 0.0f);
    public GamePanel(){
        addKeyListener(new KeyBoardInput(this));
    }
    public void setvelocity(Float x,Float y){
        this.vel.x+=x;
        this.vel.y+=y;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(Math.round(this.vel.x),Math.round(this.vel.y), 200, 50);
    }
}
