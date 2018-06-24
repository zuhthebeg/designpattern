package strategy.duck;

import strategy.duck.behavior.FlyRocketPowered;

/**
 * Created by cocy on 2018. 6. 12..
 */
public class DuckSimulator {
    public static void main(String[] args){

        Duck model = new MallDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.display();

    }
}
