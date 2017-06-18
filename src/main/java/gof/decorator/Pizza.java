package gof.decorator;

import java.math.BigDecimal;

public abstract class Pizza {

    protected String description = null;

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal cost();
}
