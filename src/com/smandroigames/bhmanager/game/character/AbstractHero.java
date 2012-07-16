package com.smandroigames.bhmanager.game.character;

import com.smandroigames.bhmanager.utils.NameGenerator;

/**
 * Created with IntelliJ IDEA.
 * User: Joza
 * Date: 8.7.2012
 * Time: 18:37
 * To change this template use File | Settings | File Templates.
 */
public class AbstractHero {
    /*private String name;
    private FighterClass fighterClass;
    private int age;

    private int injured;
    private int salary;

    private int strength;
    private int dexterity;
    private int mana;
    private int maxMana;
    private int healt;
    private int maxHealt;
    private int movement;
    private int maxMovement;

    //skills
    private int oneHanded;
    private int twoHanded;
    private int ranged;


    public Hero(FighterClass fighterClass) {
        name = NameGenerator.getFighterName();
        this.fighterClass = fighterClass;
        age = 20 + (int)Math.floor(Math.random()*20);

        strength = randomize(fighterClass.getBaseStrength(), 40);
        dexterity = randomize(fighterClass.getBaseDexterity(), 40);
        maxMana = randomize(fighterClass.getBaseMana(), 40);
        maxHealt = randomize(fighterClass.getBaseHealth(), 40);
        maxMovement = fighterClass.getBaseMovement();

        mana = maxMana;
        healt = maxHealt;
        movement = maxMovement;
        injured = 0;

        salary = calculateBaseSalary();
    }

    private int randomize(int value, int percentage){
        double ratio = percentage/100.0;
        return (int) Math.ceil(value + ratio*2*(Math.random()-0.5)*value);
    }

    private int calculateBaseSalary(){
        int salary = strength+dexterity+maxMana+maxHealt;
        double ageFactor = Math.pow(Math.pow(1.01, -2*Math.pow(age-18,2)),0.2);
        return (int)Math.round(salary*ageFactor);
    }
  */
}
