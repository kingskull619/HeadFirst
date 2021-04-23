package com.headFirst.decorator.starBuzz.decorators;

import com.headFirst.decorator.starBuzz.Beverage;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.cost() + ", Steamed milk";
    }
}
