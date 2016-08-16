package controllers.gamescene;

import Utils.Utils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by haduo on 8/16/2016.
 */
public class MenuGameScene implements GameScene, KeyListener {

    GameSceneListener gameSceneListener;

    private Image background;

    @Override
    public void draw(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    public MenuGameScene(){
        background = Utils.loadImage("resources/Start.png");
    }

    @Override
    public KeyListener getKeyListener() {
        return this;
    }

    @Override
    public void setGameSceneListener(GameSceneListener gameSceneListener) {
        this.gameSceneListener = gameSceneListener;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            if (gameSceneListener != null){
                gameSceneListener.changeGameScene(new PlayGameScene());
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {

    }
}
