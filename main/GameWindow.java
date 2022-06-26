package main;
import javax.swing.JFrame;
public class GameWindow extends JFrame {
    public GameWindow(GamePanel gamePanel){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gamePanel);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
    }   
}
