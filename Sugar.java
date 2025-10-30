package cafe.decorators;

import cafe.core.Beverage;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Сахар";
    }

    @Override
    public double cost() {
        return beverage.cost() + 100;
    }
}
