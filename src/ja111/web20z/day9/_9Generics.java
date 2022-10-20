package ja111.web20z.day9;

import java.util.ArrayList;
import java.util.List;

public class _9Generics {
    public static void main(String[] args) {
        List strings= new ArrayList(); //Object
        strings.add("a");
        strings.add("asdfa");
        strings.add(12312);
        Object s=strings.get(0);
        String str= (String) s;

        List<String> listOfStrings= new ArrayList();
        listOfStrings.add("asdfasdf");
        //type safety
       //listOfStrings.add(23432);


    }
}
