package com.smandroigames.bhmanager.game.item.weapon;

/**
 * Created with IntelliJ IDEA.
 * User: Joza
 * Date: 8.7.2012
 * Time: 20:27
 * To change this template use File | Settings | File Templates.
 */
public class BaseDamage {
    private int times;
    private int sides;

    public BaseDamage(int times, int sides) {
        this.times = times;
        this.sides = sides;
    }

    public int getTimes() {
        return times;
    }

    public int getSides() {
        return sides;
    }

    public int roll(){
        int damage = 0;
        for(int i=0; i<times; i++){
            damage += (int)Math.ceil(Math.random()*sides);
        }
        return damage;
    }

    @Override
    public String toString() {
        return times+"d"+sides;
    }
}
