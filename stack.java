package Collection_Framework;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);


        stack.pop();
        System.out.println(stack);


        System.out.println(stack.peek());
        Integer peek = stack.peek();
        System.out.println(peek);

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        int search=stack.search(20);
        System.out.println(search);

        // Using LinkedList as a Stack

        LinkedList<Integer> lst = new LinkedList<>();
        lst.addLast(1);  // push
        lst.addLast(2);
        lst.addLast(3);
        lst.addLast(4);
        lst.getLast();      // peek
        lst.removeLast();   // pop
        lst.size();
        System.out.println(lst);
        
    }
}
