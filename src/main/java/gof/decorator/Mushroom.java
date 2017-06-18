package gof.decorator;

import java.math.BigDecimal;

public class Mushroom extends ToppingDecorator {

    Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + " , Mushroom";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(0.25).add(pizza.cost());
    }
}
