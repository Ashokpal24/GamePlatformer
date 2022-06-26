package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;
import utils.Vector2d;

public class KeyBoardInput implements KeyListener {
    private Vector2d Direction = new Vector2d(0.0f, 0.0f);
    private GamePanel gPanel;
    private int SPEED=5;
    public KeyBoardInput(GamePanel gamePanel)
    {
        this.gPanel=gamePanel;
        setVel();
    }
    public void setVel() {
        //System.out.println(this.Direction.x+" "+this.Direction.y);
        gPanel.setvelocity(this.Direction.x*SPEED,this.Direction.y*SPEED);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                Direction.y = -1.0f;
                break;
            case KeyEvent.VK_A:
                Direction.x = -1.0f;
                break;
            case KeyEvent.VK_S:
                Direction.y = 1.0f;
                break;
            case KeyEvent.VK_D:
                Direction.x = 1.0f;
            default:
                break;
        }
        setVel();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                Direction.y = 0.0f;
                break;
            case KeyEvent.VK_A:
                Direction.x = 0.0f;
                break;
            case KeyEvent.VK_S:
                Direction.y = 0.0f;
                break;
            case KeyEvent.VK_D:
                Direction.x = 0.0f;
                break;
            default:
                break;
        }
        setVel();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}
