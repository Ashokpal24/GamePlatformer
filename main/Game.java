package main;
public class Game {
    GamePanel gamePanel;
    GameWindow gameWindow;
    public Game(){
        gamePanel=new GamePanel();
        gameWindow=new GameWindow(gamePanel);
        gamePanel.setFocusable(true);
        gamePanel.requestFocus();
    }
}
