package com.smandroigames.bhmanager.game.character;

import com.smandroigames.bhmanager.game.attribute.*;
import com.smandroigames.bhmanager.game.item.armor.Armor;
import com.smandroigames.bhmanager.game.item.armor.Clothes;

/**
 * Created with IntelliJ IDEA.
 * User: Joza
 * Date: 8.7.2012
 * Time: 18:38
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractFighter implements Fighter{
    private Strength strength;
    private Agility agility;
    private Magic magic;
    private Vitality vitality;
    private Luck luck;

    private HP hP;
    private MP mP;

    private Armor armor;
    private MagicResistance magicResistance;

    protected AbstractFighter(int strength, int agility, int magic, int vitality, int luck, int maxHP, int maxMP, int magicResistance) {
        this.strength = new Strength(strength);
        this.agility = new Agility(agility);
        this.magic = new Magic(magic);
        this.vitality = new Vitality(vitality);
        this.luck = new Luck(luck);
        this.hP = new HP(maxHP, maxHP);
        this.mP = new MP(maxMP, maxMP);
        this.armor = new Clothes();
        this.magicResistance = new MagicResistance(magicResistance);
    }

    @Override
    public Strength getStrength() {
        return strength;
    }

    @Override
    public Agility getAgility() {
        return agility;
    }

    @Override
    public Magic getMagic() {
        return magic;
    }

    @Override
    public Vitality getVitality() {
        return vitality;
    }

    @Override
    public Luck getLuck() {
        return luck;
    }

    @Override
    public HP getHP() {
        return hP;
    }

    @Override
    public MP getMP() {
        return mP;
    }

    @Override
    public Armor getArmor() {
        return armor;
    }

    @Override
    public MagicResistance getMagicResistance() {
        return magicResistance;
    }

    @Override
    public boolean isAlive() {
        return getHP().getValue() > 0;
    }
}
