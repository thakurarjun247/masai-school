package sb101.web18.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _5Map {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mogambo", "Aaga", "Superman" );
        List<String> listUpperCase=list
                .stream()
                .map(item -> item.toUpperCase())
                .collect(Collectors.toList());
        System.out.print(list);
        System.out.println(listUpperCase);

        List<Integer> intList= Arrays.asList(1,2,3,4, 5, 6);
       intList
                .stream()
                .map(integer -> integer*2)
                .forEach(item -> System.out.print(item));
       //another way
        intList
                .stream()
                .map(integer -> integer*2)
                .forEach(System.out::print);
       //foreach returns void


    }
}
