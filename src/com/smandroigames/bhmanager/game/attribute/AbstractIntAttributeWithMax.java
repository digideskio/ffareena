package com.smandroigames.bhmanager.game.attribute;

/**
 * Created with IntelliJ IDEA.
 * User: Joza
 * Date: 8.7.2012
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractIntAttributeWithMax extends AbstractIntAttribute{

    private int maxValue;

    protected AbstractIntAttributeWithMax(int value, int maxValue) {
        super(value);
        this.maxValue = maxValue;
        checkMax();
    }

    private void checkMax() {
        if(getValue() > maxValue) setValue(maxValue);
    }

    @Override
    public void setValue(int value) {
        super.setValue(value);
        checkMax();
    }

    @Override
    public void addToValue(int add) {
        super.addToValue(add);
        checkMax();
    }


}
