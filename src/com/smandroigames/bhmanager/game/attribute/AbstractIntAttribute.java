package com.smandroigames.bhmanager.game.attribute;

/**
 * Created with IntelliJ IDEA.
 * User: Joza
 * Date: 8.7.2012
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractIntAttribute implements IntAttribute{

    private int value;

    protected AbstractIntAttribute(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        if(value < 0) value = 0;
        this.value = value;
    }

    @Override
    public void addToValue(int add){
        this.value += add;
        if(value < 0) value = 0;
    }


}
