package com.smandroigames.bhmanager.game.battle;

import com.smandroigames.bhmanager.game.character.Fighter;
import com.smandroigames.bhmanager.game.character.Hero;
import com.smandroigames.bhmanager.game.character.Monster;
import com.smandroigames.bhmanager.game.location.Location;

import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: Joza
 * Date: 8.7.2012
 * Time: 20:24
 * To change this template use File | Settings | File Templates.
 */
public class Battle {
    private List<Hero> heroes;
    private List<Monster> monsters;
    private Location location;

    private boolean battleGoing;
    private boolean playerInTurn;
    private int fighterTurnIndex;


    public Battle(List<Hero> heroes, List<Monster> monsters, Location location) {
        this.heroes = heroes;
        this.monsters = monsters;
        this.location = location;
    }


    private void initialize(){
        battleGoing = false;
        playerInTurn = true;
        fighterTurnIndex = 0;
    }

    private void start(){
        battleGoing = true;
    }




    public List<Monster> getMonsters() {
        return monsters;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isPlayerInTurn() {
        return playerInTurn;
    }

    public boolean isBattleGoing() {
        return battleGoing;
    }

    public int getFighterTurnIndex() {
        return fighterTurnIndex;
    }

    public Fighter getFighterInTurn(){
        Fighter fighter = null;

        if(playerInTurn){
            fighter = heroes.get(fighterTurnIndex);
        }
        else {
            fighter = monsters.get(fighterTurnIndex);
        }

        return fighter;
    }


}
