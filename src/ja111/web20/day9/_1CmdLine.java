package ja111.web20.day9;

import java.util.concurrent.Executors;

public class _1CmdLine {
    /*
    * Take the Command Line Argument and print the factorial of that number.
Case1-
If only one number is supplied then simply find the factorial of that number
Input5
Output120
Case2-
If two numbers are supplied then find the absolute difference of the two numbers and then find
the factorial of the resulting number.
Input5 8
Output6
Case 3-
If three or more numbers are suppliedInput5 6 8 9
OutputError*/
    public static void main(String[] args) {
        if(args.length>2 )
            System.out.println("error");
    int number;

        if(args.length==1){
            String num=args[0];
             number=Integer.parseInt(num);
        }
        if(args.length==2){
            String num1=args[0];
            String num2=args[1];
            number= Math.abs(Integer.parseInt(num1)-Integer.parseInt(num2));
            //int number=Integer.parseInt(num1)+Integer.parseInt(num2);
        }

    }

    static  int fact(int num){

        if(num==1 || num==2) return num;
        else return num*fact(num-1);
    }
}

/*Student
5>
* name: String
address: String
marks: Integer
Create a Demo class and perform the following operation in the main method:
Take the number as input from the user, How many Student objects need to be
created.
Create an array of Students with those numbers.
Initialize all the student objects by taking details from the user.
print all the Student details.
print the average of all the Student marks.
*
*/

