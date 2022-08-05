package sb101.web18.day6.fileio;

import java.io.File;
import java.io.IOException;

public class _1Filew {
    public static void main(String[] args) {
        //create a file
        File file=new File("/Users/arjun/Desktop/folder/newfile.txt");
        try {
            boolean b=file.createNewFile();
            if (b)
                System.out.println("new file created");
            else
                System.out.println("file is already there.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists());

        //create a folder
        File folder=new File("/Users/arjun/Desktop/folder/anotherFolder");
        folder.mkdir();
        System.out.println(folder);
        System.out.println(folder.exists());






        /*
        * byte oriented 00001010101
        * char oriented  "cab"
        * */






















    }
}
