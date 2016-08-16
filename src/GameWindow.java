import controllers.CollsionPool;
import controllers.PlayerController;
import controllers.enemy.RocketControllerManager;
import controllers.gamescene.GameScene;
import Utils.CommonValues;
import controllers.gamescene.GameSceneListener;
import controllers.gamescene.MenuGameScene;
import controllers.pine.PineControllerManager;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;

/**
 * Created by DUC on 8/13/2016.
 */
public class GameWindow extends Frame implements Runnable, GameSceneListener{
    Image background;
    BufferedImage bufferedImage;
    Graphics bufferImageGraphic;
    Thread thread;
    GameScene currentGameScene;

    public GameWindow(){
        configUI();
        changeGameScene(new MenuGameScene());
        this.bufferedImage = new BufferedImage(CommonValues.SCREEN_WIDTH,
                CommonValues.SCREEN_HEIGHT,
                BufferedImage.TYPE_INT_ARGB);
        this.bufferImageGraphic = bufferedImage.getGraphics();
        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void update(Graphics g) {
        currentGameScene.draw(bufferImageGraphic);
        g.drawImage(bufferedImage, -14, 0, null);

    }

    public void configUI(){
        this.setVisible(true);
        this.setLocation(0, 0);
        this.setSize(CommonValues.SCREEN_WIDTH, CommonValues.SCREEN_HEIGHT);
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }

    @Override
    public void run() {
        while (CommonValues.GAME_RUNNING) {
            try {
                currentGameScene.run();
                Thread.sleep(17);
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.exit(0);
    }

    public void changeGameScene(GameScene gameScene){
        currentGameScene = gameScene;
        this.addKeyListener(currentGameScene.getKeyListener());
        currentGameScene.setGameSceneListener(this);

    }
}

