package ja111.web20.day14;

import java.util.Stack;

public class _4Stack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        //add remove
        stack.add(0);
        stack.push(1);
        stack.push(2);
        //stack.clear();
        System.out.println(stack.empty());
        if(stack.size()>0){
            //peek, pop
        }
        System.out.println(stack.peek());; //returns the top item without removing it.
        System.out.println(stack);
        //stack.clear();
        System.out.println(stack.pop());
        stack.pop(); //don't use remove

    }
}
