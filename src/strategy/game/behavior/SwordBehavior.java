package strategy.game.behavior;

/**
 * Created by cocy on 2018. 6. 12..
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword Attack!!!");
    }
}
