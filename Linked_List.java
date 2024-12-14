package Collection_Framework;
import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.get(2);
        linkedlist.addLast(5);
        linkedlist.addFirst(100);
        linkedlist.getFirst();
        linkedlist.getLast();
        System.out.println(linkedlist);
        linkedlist.remove();

        LinkedList<String> ll = new LinkedList<>(Arrays.asList("bat","ball","pads","gloves"));
        LinkedList<String> removethings = new LinkedList<>(Arrays.asList("gloves","ball"));
        ll.removeAll(removethings);
        System.out.println(ll);
    }

}
