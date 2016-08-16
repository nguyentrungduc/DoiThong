package models;

/**
 * Created by DUC on 8/13/2016.
 */
public class GameObjectWithHP extends GameObject {
    public GameObjectWithHP(int x, int y) {
        super(x, y);
    }

    public GameObjectWithHP(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    private int hp;
    private int maxHP;

    public GameObjectWithHP(int x, int y, int width, int height, int maxHP) {
        super(x, y, width, height);
        this.hp = maxHP;
        this.maxHP = maxHP;
    }

    public int getHp() {
        return hp;
    }

    public void increaseHP(int amount) {
        this.hp += amount;
        if(this.hp > maxHP)
            this.hp = maxHP;
    }

    public void decreaseHP (int amount)
    {
        this.hp -= amount;
        if(this.hp < 0) {
            destroy();
        }
    }
}
