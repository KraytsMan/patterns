package gof.decorator;

import java.math.BigDecimal;

public class Hawaiian extends Pizza {

    public Hawaiian(String description) {
        this.description = description + ", Hawaiian";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(0.9);
    }
}
