package com.smandroigames.bhmanager.game.item.weapon;

import com.smandroigames.bhmanager.game.item.Item;

/**
 * Created with IntelliJ IDEA.
 * User: Joza
 * Date: 22.6.2012
 * Time: 16:45
 * To change this template use File | Settings | File Templates.
 */
public interface Weapon extends Item {
    public String getName();
    public BaseDamage getBaseDamage();

}
