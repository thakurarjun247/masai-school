package sb101.web18.day7.io;

import java.io.*;

public class _1BufferedWriterReader {
    public static void main(String[] args) throws IOException {
        //Two types of paths:
        //relative
        //absolute

        //File file=new File("/Users/arjun/Desktop/folder/newfile.txt");
       /* BufferedWriter bufferedWriter= new BufferedWriter(
                new FileWriter("buffer.txt")
        );*/
        //Above one is same as this:

        FileWriter fileWriter=new FileWriter("nio.txt");
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.write('c');
        bufferedWriter.write("buffered Writer");
        bufferedWriter.newLine();
        bufferedWriter.write("it will go to a new line.");
        char[] chars={'a','b'};
        bufferedWriter.write(chars);
        bufferedWriter.flush();

        BufferedReader bufferedReader= new BufferedReader(
                new FileReader("nio.txt")
        );
        bufferedReader
                .lines()
                        .forEach(System.out::println);

        bufferedReader
                .lines()
                .forEach(line-> System.out.println(line));

      /*  String line=bufferedReader.readLine();
        while (line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }*/
        bufferedWriter.close();
        bufferedReader.close();



    }
}
