package controllers;

import models.GameObject;
import models.Pine;
import views.GameDrawer;
import views.ImageDrawer;

/**
 * Created by DUC on 8/13/2016.
 */
public class PineController extends SingleController {
    private static final int SPEED = 3;

    public PineController(GameObject gameObject, GameDrawer gameDrawer) {
        super(gameObject, gameDrawer);
        this.gameVector.dx = -SPEED;
    }

    public static PineController create(int x, int y, PineType type) {
        PineController pineController = null;
        switch (type) {
            case GREEN: {
                pineController = new PineController(
                        new Pine(x, y),
                        new ImageDrawer("resources/3.png"));
                break;
            }
        }
        return pineController;
    }

    public void run(){
        super.run();
    }
}
