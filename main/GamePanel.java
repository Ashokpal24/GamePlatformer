package main;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import inputs.KeyBoardInput;
import utils.Vector2d;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.io.InputStream;
public class GamePanel extends JPanel {
    private Vector2d vel=new Vector2d(0.0f, 0.0f);
    private BufferedImage img,subImg;
    
    public GamePanel(){
        addKeyListener(new KeyBoardInput(this));
        imageImport();

        Dimension size=new Dimension(1280,720);
        setMinimumSize(size);
        setMaximumSize(size);
        setPreferredSize(size);
    }
    public void setvelocity(float x,float y){
        this.vel.x+=x;
        this.vel.y+=y;
    }
    private void imageImport()
    {
        InputStream is=getClass().getResourceAsStream("/res/player.png");
        try {
            img=ImageIO.read(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        subImg=img.getSubimage(1*32, 0, 32, 32);
        g.drawImage(subImg,(int)this.vel.x,(int)this.vel.y,64, 64, null);
    }
}
