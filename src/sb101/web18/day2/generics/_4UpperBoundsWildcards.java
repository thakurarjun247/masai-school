package sb101.web18.day2.generics;

import java.util.ArrayList;
import java.util.List;

public class _4UpperBoundsWildcards {

    public static void main(String[] args) {
       List<Rectangle> rectangleList=new ArrayList<>();
       rectangleList.add(new Rectangle());

        List<Circle> circleList=new ArrayList<>();
        circleList.add(new Circle());

        List<Integer> integerList=new ArrayList<>();
        integerList.add(5);
        drawShapes(rectangleList);
        drawShapes(circleList);
        //error
        // drawShapes(integerList);

        List<Square> squareList=new ArrayList<>();
        squareList.add(new Square());
        drawShapes(squareList);


    }
    //draw a list of shapes
    public static void drawShapes(List<? extends Shape> lists){
        for(Shape shape:lists)
            shape.draw();
    }

  }

  abstract class Shape{
    abstract void draw();
  }

  class Rectangle extends Shape{

      @Override
      void draw() {
          System.out.println("draw Rectangle");
      }
  }

  class Square extends Rectangle{
      @Override
      void draw() {
          System.out.println("draw Square");
      }
  }


class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("draw Circle");
    }
}