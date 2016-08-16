package controllers.gamescene;

import Utils.Utils;
import controllers.CollsionPool;
import controllers.PlayerController;
import controllers.enemy.RocketControllerManager;
import controllers.pine.PineControllerManager;

import java.awt.*;
import java.awt.event.KeyListener;

/**
 * Created by haduo on 8/16/2016.
 */
public class PlayGameScene implements GameScene {

    private Image background;

    public PlayGameScene(){
        background = Utils.loadImage("resources/background2.jpg");
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(background, 0, 0, null);
        PlayerController.instance.draw(g);
        PineControllerManager.instance.draw(g);
        RocketControllerManager.instance.draw(g);
    }

    @Override
    public KeyListener getKeyListener() {
        return PlayerController.instance;
    }

    @Override
    public void setGameSceneListener(GameSceneListener gameSceneListener) {

    }

    @Override
    public void run() {
        PlayerController.instance.run();
        PineControllerManager.instance.run();
        RocketControllerManager.instance.run();
        CollsionPool.instance.run();
    }
}
