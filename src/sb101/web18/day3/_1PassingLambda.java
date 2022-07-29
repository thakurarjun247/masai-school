package sb101.web18.day3;

public class _1PassingLambda {
    public static void main(String[] args) {
        //lambda syntax: (args) -> body;
        Calculator calculateSum = (a,b) -> a+b;
        //same as
        //Calculator calculateSumAnotherWay = (a,b) -> {return a+b;};

        Calculator calculateSub = (a,b) -> a-b;
        System.out.println(calculateSum.calculate(5,5));
        System.out.println(calculateSub.calculate(5,5));

        //pass a lambda in a function
        System.out.println(
                getOutput(100, 50, calculateSum)
        );

        //can be rewritten as
        System.out.println(getOutput(200, 300, (a,b)->(a+b) ));

        System.out.println(getOutput(5,10, (x,y)->x*y));
    }

    public static int getOutput(int a, int b, Calculator operation ){
        return operation.calculate(a,b);
    }
}


interface Calculator{
    public int calculate(int a, int b);
}
