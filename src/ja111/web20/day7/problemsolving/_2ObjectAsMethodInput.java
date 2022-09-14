package ja111.web20.day7.problemsolving;

public class _2ObjectAsMethodInput {
    public static void main(String[] args) {
        Movie movie= new Movie(2, "movieName");
        System.out.println(movie);
        objAsInput(movie);
        Movie movie1=returnObject();
    }
    //a method that takes an object-Movie as an input
    static void objAsInput(Movie movieItCanBeAnyName){
        System.out.println(movieItCanBeAnyName.getName());
        System.out.println(movieItCanBeAnyName.getDuration());
    }

    static Movie returnObject(){
        Movie movie=new Movie(4, "name");
        return  movie;
    }
}
