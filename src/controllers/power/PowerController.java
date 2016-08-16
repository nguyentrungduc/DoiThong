package controllers.power;

import controllers.SingleController;
import models.GameObject;
import views.GameDrawer;

/**
 * Created by DUC on 8/14/2016.
 */
public class PowerController extends SingleController {
    private static final int POWERSPEED = 18;

    public PowerController(GameObject gameObject, GameDrawer gameDrawer) {
        super(gameObject, gameDrawer);
        this.gameVector.dy = POWERSPEED;
    }

    public void run(){
        if(this.gameObject.getY() > 800 ){
            gameObject.destroy();
        }
        super.run();
    }
}
