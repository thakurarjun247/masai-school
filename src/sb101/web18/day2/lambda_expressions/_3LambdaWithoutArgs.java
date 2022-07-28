package sb101.web18.day2.lambda_expressions;

public class _3LambdaWithoutArgs {
    public static void main(String[] args) {
        NoArg noArg= () -> System.out.println("hello, there");
                noArg.hello(); // hello, there
    }
}
@FunctionalInterface
interface NoArg{
    abstract void hello();
}
