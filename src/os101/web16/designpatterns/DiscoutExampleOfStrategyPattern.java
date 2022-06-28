package os101.web16.designpatterns;

import java.math.BigDecimal;

public class DiscoutExampleOfStrategyPattern {
    public static void main(String[] args) {
        Discounter ddiscounter= new DiwaliDiscounter();
        Discounter iddiscounter= new IDDiscounter();
        System.out.println(iddiscounter.applyDiscount(BigDecimal.valueOf(100)));
    }
}

interface Discounter{
    BigDecimal applyDiscount(BigDecimal amount);
}

class DiwaliDiscounter implements Discounter{

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(.5));
    }
}

class IDDiscounter implements Discounter{

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(.6));
    }
}