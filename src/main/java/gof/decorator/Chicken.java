package gof.decorator;

import java.math.BigDecimal;

public class Chicken extends ToppingDecorator {

    Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + " , Chicken";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(0.7).add(pizza.cost());
    }
}
