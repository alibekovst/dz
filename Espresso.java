package cafe.core;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Эспрессо";
    }

    @Override
    public double cost() {
        return 800;
    }
}
