package controllers.gamescene;

import java.awt.*;
import java.awt.event.KeyListener;

/**
 * Created by haduo on 8/16/2016.
 */
public interface GameScene extends Runnable {
    void draw(Graphics g);
    KeyListener getKeyListener();
    void setGameSceneListener(GameSceneListener gameSceneListener);
}
