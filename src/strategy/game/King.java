package strategy.game;

/**
 * Created by cocy on 2018. 6. 12..
 */
public class King extends Character {

    @Override
    void fight() {
        weapon.useWeapon();
    }
}
