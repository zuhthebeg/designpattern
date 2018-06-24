package strategy.duck;

import strategy.duck.behavior.FlyWithWings;
import strategy.duck.behavior.Quack;

/**
 * Created by cocy on 2018. 6. 12..
 */
public class MallDuck extends Duck{

    public MallDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


}
