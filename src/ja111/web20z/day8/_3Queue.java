package ja111.web20z.day8;

import java.util.*;

public class _3Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //FIFO
        q.add(6);
        q.add(7);
        q.add(8);
        //q.remove();
        List<Integer> list= new ArrayList<>();
        list.add(6);
        list.add(7);
        q.removeAll(list);
        q.remove();//throws  exception if empty
        q.clear();
        q.poll();//return null  if empty


    }
}
