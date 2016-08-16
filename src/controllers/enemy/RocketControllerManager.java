package controllers.enemy;

import controllers.ControllerManager;

import java.util.Random;

/**
 * Created by DUC on 8/13/2016.
 */
public class RocketControllerManager extends ControllerManager {
    private int count;
    private static final int RESPAWN = 200;

    private RocketControllerManager() {
        super();
    }

    public void run(){
        Random rd = new Random();
        super.run();
        count ++;
        int enX = 1000;
        int enY = rd.nextInt(250);
        if(count == RESPAWN){
            count = 0;
            RocketController rocketController = RocketController.create(
                    enX, enY, RocketType.CHICKEN);
            this.add(rocketController);
        }
    }

    public static final RocketControllerManager instance = new RocketControllerManager();
}
