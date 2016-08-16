package views;

import models.GameObject;
import Utils.Utils;

import java.awt.*;

/**
 * Created by DUC on 8/12/2016.
 */
public class ImageDrawer implements GameDrawer {
    private Image img;
    public ImageDrawer(){
        this.img = img;
    }
    public  ImageDrawer(String url){
        this.img = Utils.loadImage(url);

    }

    public void draw(Graphics g, GameObject gameObject){
        g.drawImage(img, gameObject.getX(), gameObject.getY(),
                gameObject.getWidth(),gameObject.getHeight(), null);

    }
}
