package ja111.web20.day14;

import java.util.Comparator;
import java.util.Objects;

public class Plant implements Comparable<Plant> {
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

    @Override
    public boolean equals(Object o) {
        Plant that = (Plant) o;
        return this.color==that.color && this.height==that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, color);
    }

    @Override
    public int compareTo(Plant that) { // -1, 0, 1
        if(this.height==that.height)
            return 0;
        if(this.height> that.height)
            return -1;
        else
            return 1;
    }
}
