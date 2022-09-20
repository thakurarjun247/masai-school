package ja111.web20.day11;

public class _5IsTHereConflictInMultipleImplementation {

    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
        square.getS();
    }
}
interface ShapeInterface{
    String s="shape";
    public void draw();
}

interface RectangleInterface{
    String s="Rectangle";
    void draw();
}
//The visibility of subtype method should have >= the visibility of parent type method
class Square implements ShapeInterface, RectangleInterface{
   public void draw(){
        System.out.println("method of shape interface");
    }
    void getS(){
        System.out.println(RectangleInterface.s);
        System.out.println(ShapeInterface.s);
    }
}
//public -> protected, default-> private
