package ja111.web20.day7.problemsolving;

public class Movie {
    private int duration;
    private String name;
    Movie(){}

    public Movie(int duration, String name) {
        this.duration = duration;
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
