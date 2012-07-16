package com.smandroigames.bhmanager.game.item.weapon.meleeweapon;

import com.smandroigames.bhmanager.game.battle.DamageSolver;

public class BasicDagger implements MeleeWeapon {

    @Override
    public int getDamage() {
        return DamageSolver.rollDamage(4, 1);
    }

    @Override
    public String getDamageString() {
        return "3d1";
    }
}
