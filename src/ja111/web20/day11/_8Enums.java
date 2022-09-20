package ja111.web20.day11;

public class _8Enums {
    public static void main(String[] args) {
        /*Direction direction;
       direction*/
        Direction direction;
        direction=Direction.EAST;
        Direction direction1=Direction.WEST;
        System.out.println(direction1==direction);
        System.out.println(direction1==Direction.WEST);
        //blocked, active, paid, new, "justarrived"
    }
}
enum Direction{
    EAST, WEST, NORTH, SOUTH;
}

/*
final class Direction extends Enum {
    public static final Direction EAST= new Direction();
    public static final Direction WEST= new Direction();
    public static final Direction NORTH= new Direction();
    public static final Direction SOUTH= new Direction();
}*/
enum Color {
    RED,
    GREEN,
    BLUE,
    QUEEN_BLUE;
}
/*

final class Color extends Enum
{
    public static final Color RED = new Color();
    public static final Color BLUE = new Color();
    public static final Color GREEN = new Color();
}*/
