package os101.web16.designpatterns;

public class WithoutFactoryPattern {
    public static void main(String[] args) {
        String countryName="USA";

        Currency currency=receptionist("India");

    }
    public static Currency  receptionist(String countryName){
        if(countryName.equals("USA"))
            return new USDCurrency();
        if(countryName.equals("India"))
            return new INRCurrency();
        else
            return  null;
    }
}


interface Currency{
    public String getSymbol();
}
class INRCurrency implements Currency{
    public String getSymbol(){
        return "indian rupee";
    }
}
class USDCurrency implements Currency{
    public String getSymbol(){
        return "USD Dollars";
    }
}
