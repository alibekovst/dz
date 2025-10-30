package cafe.core;

public class Tea implements Beverage {
    @Override
    public String getDescription() {
        return "Чай";
    }

    @Override
    public double cost() {
        return 500;
    }
}
