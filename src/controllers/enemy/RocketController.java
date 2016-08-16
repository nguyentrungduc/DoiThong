package controllers.enemy;

import controllers.SingleController;
import models.GameObject;
import models.Rocket;
import views.GameDrawer;
import views.ImageDrawer;

/**
 * Created by DUC on 8/13/2016.
 */
public class RocketController extends SingleController {
    private static final int SPEED = 15;

    public RocketController(GameObject gameObject, GameDrawer gameDrawer) {
        super(gameObject, gameDrawer);
        this.gameVector.dx = -SPEED;
    }

    public static RocketController create(int x, int y, RocketType type) {
        RocketController pineController = null;
        switch (type) {
            case CHICKEN: {
                pineController = new RocketController(
                        new Rocket(x, y),
                        new ImageDrawer("resources/rocket2.png"));
                break;
            }
        }
        return pineController;
    }




}
