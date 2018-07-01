package decorator.condiment;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;
    double addedCost;

    public Whip(Beverage beverage){
        this.beverage = beverage;
        this.addedCost = 0.30;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whipping("+this.addedCost+")";
    }

    @Override
    public double cost() {
        return beverage.cost() + this.addedCost;
    }
}
