package gof.decorator;

import java.math.BigDecimal;

public class Italian extends Pizza {

    public Italian(String description) {
        this.description = description + ", Italian";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(1.2);
    }
}
