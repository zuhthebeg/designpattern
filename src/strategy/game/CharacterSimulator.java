package strategy.game;


import strategy.game.behavior.HandBehavior;
import strategy.game.behavior.SwordBehavior;

/**
 * Created by cocy on 2018. 6. 12..
 */
public class CharacterSimulator {
    public static void main(String args[]){

        Character c = new King();
        c.setWeaponBehavior(new HandBehavior());
        c.fight();
        c.setWeaponBehavior(new SwordBehavior());
        c.fight();
    }
}
