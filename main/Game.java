package main;
public class Game implements Runnable{
    private GamePanel gamePanel;
    private GameWindow gameWindow;
    private int FPS_SET=120;
    private Thread gameThread;
    public Game(){
        gamePanel=new GamePanel();
        gameWindow=new GameWindow(gamePanel);
        gamePanel.setFocusable(true);
        gamePanel.requestFocus();
        startGameloop();
    }
    private void startGameloop()
    {
        gameThread=new Thread(this);
        gameThread.start();
    }
    @Override
    public void run(){
        double timePerFrame=1000000000/FPS_SET;
        long lastFrame=System.nanoTime();

        long lastCheck=0;
        int frame=0;
        while(true)
        {
            //FPS set
            long now=System.nanoTime();
            if(now-lastFrame>=timePerFrame)
            {
                gamePanel.repaint();
                lastFrame=now;
                frame++;
            }
            //print FPS
            long nowFpsPrint=System.currentTimeMillis();
            if(nowFpsPrint-lastCheck>1000)
            {
                lastCheck=nowFpsPrint;
                System.out.println("FPS: "+frame);
                frame=0;
            }
        }
    }
}
