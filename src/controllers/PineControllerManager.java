package controllers;

/**
 * Created by DUC on 8/13/2016.
 */
public class PineControllerManager extends ControllerManager {
    private int count;
    private static final int RESPAWN = 100;

    private PineControllerManager() {
        super();
    }

    public void run(){
        super.run();
        count ++;
        int enX = 1000;
        int enY = 300;
        if(count == RESPAWN){
            count = 0;
                PineController pineController = PineController.create(
                        enX, enY, PineType.GREEN);
                this.add(pineController);
            }
    }

    public static final PineControllerManager instance = new PineControllerManager();
}
