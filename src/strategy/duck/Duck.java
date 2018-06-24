package strategy.duck;

import strategy.duck.behavior.FlyBehavior;
import strategy.duck.behavior.QuackBehavior;

/**
 * Created by cocy on 2018. 6. 12..
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void swim(){System.out.println("can swim!!");};
    void display(){System.out.println("can display!!");};

    void performFly(){
        flyBehavior.fly();
    };
    void performQuack(){
        quackBehavior.quack();
    };

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
