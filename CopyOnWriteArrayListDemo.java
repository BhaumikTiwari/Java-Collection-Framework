package Collection_Framework;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList <Integer> lst = new CopyOnWriteArrayList<>();
        /*
        "Copy or Write" means that whenever a write operation
        like adding or removing an element, instead of directly modifying the existing list
        a new copy of the list is created, and the modification is applied to that copy
        This ensures that other threads reading the list while its being modified are unaffected.

        Read Operations: Fast and direct, since they happen on a stable list without interference from modification.
        Write Operations: A new copy of the list is created for every modification. The reference to list is then updated
        so that the subsequent reads this new list.
        */

        // use it when there are more read operations

        // List <String> shoppinglist = new ArrayList<>();  -> this line throw an exception
        List <String> shoppinglist = new CopyOnWriteArrayList<>();
        shoppinglist.add("Milk");
        shoppinglist.add("Eggs");
        shoppinglist.add("Bread");
        System.out.println(shoppinglist);

        for(String item: shoppinglist){
            System.out.println(item);
            if(item.equals("Bread")){
                shoppinglist.add("Butter");
                System.out.println("added butter while reading");
            }
        }
        System.out.println("update list: "+shoppinglist);

    }
}
