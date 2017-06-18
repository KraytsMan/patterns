package gof.decorator;

import java.math.BigDecimal;

public class Onion extends ToppingDecorator {

    Pizza pizza;

    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + " , Onion";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(0.3).add(pizza.cost());
    }
}
