package ja111.web20z.day10;

import ja111.web20.day14.Plant;

import java.util.ArrayList;
import java.util.List;

public class _5UpperBounds {

    public static void main(String[] args) {
        List<Rectangle> rectangleList=new ArrayList<>();
        rectangleList.add(new Rectangle());

        List<Circle> circleList=new ArrayList<>();
        circleList.add(new Circle());

        drawShape(circleList);
        drawShape(rectangleList);

        List<Plant> plantList= new ArrayList<>();
       // drawShape(plantList);

    }
    static void drawShape(List<? extends Shape> lists){
        for(Shape s : lists)
            System.out.println(s);
    }
}

abstract class Shape{
    abstract  void draw();
}
class Circle extends Shape{
    @Override
    public String toString() {
        return this.getClass().toString();
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }
}
class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("draw Rectangle");
    }

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
