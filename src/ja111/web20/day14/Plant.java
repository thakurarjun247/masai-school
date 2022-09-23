package ja111.web20.day14;

import java.util.Comparator;
import java.util.Objects;

public class Plant {
    int height;
    String color;


    public Plant(int height, String color) {
        this.height = height;
        this.color = color;
    }
    public Plant(){}

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
