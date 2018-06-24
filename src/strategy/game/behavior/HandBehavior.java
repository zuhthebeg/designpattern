package strategy.game.behavior;

/**
 * Created by cocy on 2018. 6. 12..
 */
public class HandBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Hand Attack!!!");
    }
}
