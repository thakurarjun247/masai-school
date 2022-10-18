package ja111.web20z.day7.object;

public class Movie { ///extends Object
    String name;
    Double duration;

    public Movie(String name, Double duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return this.name+"->"+duration;
    }
}
