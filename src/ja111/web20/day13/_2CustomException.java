package ja111.web20.day13;

import java.util.Scanner;

public class _2CustomException {
    public static void main(String[] args) {
        try {
            validateEmail();
        } catch (DuplicateEmailException e) {
            e.printStackTrace();
        }
    }
    static void validateEmail() throws DuplicateEmailException{
        Scanner scanner= new Scanner(System.in);
        String[] emails={"abc@gmail.com", "xyz@gmail.com"};
        System.out.println("enter an email");
        String email=scanner.next();
        for (String e: emails
        ) {
            if(email.equals(e))
                throw new DuplicateEmailException("email already exists");
        }
    }
}

class DuplicateEmailException extends Exception{
    public DuplicateEmailException(String message) {
        super(message);
    }
    public DuplicateEmailException(){}
}
