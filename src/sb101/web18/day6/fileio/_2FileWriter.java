package sb101.web18.day6.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _2FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("/Users/arjun/Desktop/folder/newfile.txt");
        fileWriter.write(100); // int -> char a=97, 98=b, 99=c, 100=d;
        fileWriter.write("india \n is great");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader= new FileReader("/Users/arjun/Desktop/folder/newfile.txt");
        int index=fileReader.read();
        while (index!= -1)
        {
            System.out.print((char) index);
            index=fileReader.read();
        }
    }
}
