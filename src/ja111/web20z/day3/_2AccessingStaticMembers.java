package ja111.web20z.day3;
// How many copies of them are created.
//static is related to a class. Only one copy
//non-static is related to an object. Many copies
public class _2AccessingStaticMembers {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();

        account1.balance=11.7;
        //account1.bankName="City";
        BankAccount account2= new BankAccount();
        account2.balance=12.3;
        //account2.bankName="City";
        //how to access static variable?
        //1. using the class name
        System.out.println(BankAccount.bankName);



    }
}

class BankAccount{
    Double balance;
    static String bankName="citi"; //city

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }
}



//class : class variable aka static only one copy
//object: instance variables each obj has it's own copy.



