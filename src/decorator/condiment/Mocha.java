package decorator.condiment;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha(+.20)";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
