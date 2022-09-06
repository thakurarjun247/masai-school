package ja111.web20.day4;

public class _9Account {
    String customerName; //cust name
    double balance;

    static String bankName;

    public static void main(String[] args) {
        _9Account.bankName="HDFC";
        _9Account yourAccount= new _9Account();
        yourAccount.balance=3123423424.1234;
        yourAccount.customerName="Nirbhay";

        _9Account myAccount=new _9Account();
        myAccount.customerName="myName";
        myAccount.balance=999999342134512.44;

        System.out.println(yourAccount.customerName+yourAccount.balance);
        System.out.println(_9Account.bankName);



    }

}
