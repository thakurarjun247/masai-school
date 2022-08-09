package sb101.web18.day7.nio;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _2WriteUsingNIO {
    public static void main(String[] args) throws IOException {
        Path p= Paths.get("newFile.txt");
        Files.write(p, "write using nio".getBytes(StandardCharsets.US_ASCII));
        //StandardOpenOption.APPEND will make sure the previous data isn't cleared
        Files.write(p, Arrays.asList("one", "two"), StandardOpenOption.APPEND);
        List<String> list=Files
                .readAllLines(p);

        for(String line:list)
            System.out.println(line);
       list.forEach(item -> System.out.println(item));

        //find and replace: using
        //REPLACE: "WITH THE HELP OF"
       Stream<String> str=Files.lines(p);
       str
               .map(
                       line ->{
                           if(line.contains("using"))
                               return line.replace("using", "with the help of");
                           else
                               return line;
                       }
               ).forEach( newLine -> System.out.println(newLine));


    }
}
