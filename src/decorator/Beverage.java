package decorator;

public abstract class Beverage {
    String description = "none";

    public String getDescription(){
        System.out.println(description + " / " + cost());
        return description;
    }

    public abstract double cost();
}
