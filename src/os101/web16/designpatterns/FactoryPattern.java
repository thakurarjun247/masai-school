package os101.web16.designpatterns;

import java.sql.DriverManager;

public class FactoryPattern {
    public static void main(String[] args) {

        System.out.println(CurrencyFactory.createCurrency("India").getSymbol());
    }
}
//creates currency objects
class CurrencyFactory{
    public static Currency createCurrency(String country){
        if(country.equals("USA"))
            return new USDCurrency();
        if(country.equals("India"))
            return new INRCurrency();
        else
            throw new UnsupportedOperationException("currency not supported");
    }
}
