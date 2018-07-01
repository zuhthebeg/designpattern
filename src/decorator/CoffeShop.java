package decorator;

import decorator.condiment.Mocha;
import decorator.condiment.Whip;

public class CoffeShop {
    public static void main(String args[]){

        Beverage houseBlend = new HouseBlend();
        Beverage esspresso = new Espresso();

        //System.out.println(houseBlend.getDescription() + " / " + houseBlend.cost());
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription() + " / " + houseBlend.cost());

        //System.out.println(esspresso.getDescription() + " / " + esspresso.cost());
        esspresso = new Whip(esspresso);
        //System.out.println(esspresso.getDescription() + " / " + esspresso.cost());
        esspresso = new Whip(esspresso);
        System.out.println(esspresso.getDescription() + " / " + esspresso.cost());
    }
}
