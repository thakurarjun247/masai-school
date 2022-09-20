package ja111.web20.day11;

public class _11VarArgs {
    void print(int i){
        System.out.println(i);
    }
    void print(int i, int j){
        System.out.println(i+" "+j);
    }
    void print(Integer... integers){
        for (Integer i: integers
             ) {
            System.out.print(integers+" ");
        }
    }

    public static void main(String[] args) {
       _11VarArgs obj= new _11VarArgs();
       obj.print(1,2,3);
    }
}
