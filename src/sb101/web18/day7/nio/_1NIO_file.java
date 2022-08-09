package sb101.web18.day7.nio;
import java.io.IOException;
import java.nio.file.*;
public class _1NIO_file {
    public static void main(String[] args) throws IOException {
        Path p= Paths.get("newFile.txt");
        if(Files.exists(p)){
            System.out.println("file exists");
        }
        else {
            Path p2=Files.createFile(p);
            System.out.println("created a file at :"+ p2);
        }


    }
}
