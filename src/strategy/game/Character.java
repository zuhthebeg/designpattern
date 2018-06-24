package strategy.game;


import strategy.game.behavior.WeaponBehavior;

/**
 * Created by cocy on 2018. 6. 12..
 */
public abstract class Character {
    WeaponBehavior weapon;

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weapon = w;
    }

    abstract void fight();
}
