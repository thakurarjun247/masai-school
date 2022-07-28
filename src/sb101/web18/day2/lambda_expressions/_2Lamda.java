package sb101.web18.day2.lambda_expressions;

public class _2Lamda {
    public static void main(String[] args) {
        LambdaInterface lambdaInterface = ( n1,  n2) -> System.out.println(n1+n2);

        lambdaInterface.add(3,4);

        LambdaInterfaceWithReturn lambdaInterfaceWithReturn= ( n1,  n2) -> {return (n1+n2);};
        //another way
        LambdaInterfaceWithReturn lambdaInterfaceWithReturn1= ( n1,  n2) ->n1+n2;
        System.out.println(lambdaInterfaceWithReturn.add(4,5));;


    }
}
@FunctionalInterface
interface LambdaInterface{
    abstract void add(int n1, int n2);
}

interface LambdaInterfaceWithReturn{
    abstract int add(int n1, int n2);
}