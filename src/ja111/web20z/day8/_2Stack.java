package ja111.web20z.day8;

import java.util.Stack;

public class _2Stack {
    //lifo
    // Plates
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(8);  //1
        //Stack underflow: EmptyStackException
        System.out.println(stack.pop());; //0
        //stack.pop();
        if(!stack.isEmpty()){
            stack.pop();
        }
       // if(stack.size())

        stack.push(0);
        System.out.println( stack.peek());; //doens't remove, it just returns
        System.out.println(stack.size());

    }
}
