package com.smandroigames.bhmanager.game.character;

import com.smandroigames.bhmanager.game.attribute.*;
import com.smandroigames.bhmanager.game.item.armor.Armor;

/**
 * Created with IntelliJ IDEA.
 * User: Joza
 * Date: 8.7.2012
 * Time: 18:25
 * To change this template use File | Settings | File Templates.
 */
public interface Fighter {
    public String getName();

    public Strength getStrength();
    public Agility getAgility();
    public Magic getMagic();
    public Vitality getVitality();
    public Luck getLuck();

    public HP getHP();
    public MP getMP();

    public Armor getArmor();
    public MagicResistance getMagicResistance();

    public boolean isAlive();

}
