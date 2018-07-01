package decorator;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public void display(){

    }
    @Override
    public double cost() {
        return 0;
    }
}
