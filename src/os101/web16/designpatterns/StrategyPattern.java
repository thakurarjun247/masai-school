package os101.web16.designpatterns;

public class StrategyPattern {
    public static void main(String[] args) {
        Strategy addStrategy= new AddStrategy();
        Strategy mulStrategy= new MulStrategy();
        Context context= new Context(mulStrategy);
        System.out.println(context.apply(2,3));
    }
}
interface Strategy{
    int compute(int a, int b);
}

class AddStrategy implements Strategy{

    @Override
    public int compute(int a, int b) {
        return a+b;
    }
}

class MulStrategy implements Strategy{

    @Override
    public int compute(int a, int b) {
        return a*b;
    }
}

class Context{
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public int apply(int a, int b){
        return strategy.compute(a,b);
    }

}

