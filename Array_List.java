package Collection_Framework;
import java.util.*;

/*
Unlike regular array , which has fixed size, an ArrayList can grow and shrinks as elements are added or removed.
This dynamic resizing is archived by creating a new array when the current array is full and copying the elements to the new array.
*/

public class Array_List {
    public static void main(String[] args) {
        ArrayList <Integer> arrlst = new ArrayList<>();  // initial capacity of ArrayList is 10, we can also set the initial  capacity by passing the value, ArrayList<>(1000);
        arrlst.add(10); //0
        arrlst.add(20); //1
        arrlst.add(30); //2
        arrlst.add(40); //3
        arrlst.add(50); //4

        arrlst.trimToSize();  // this method will reduce the capacity of ArrayList to its size to save memory/resources.

        System.out.println(arrlst.get(2));
        System.out.println(arrlst.size());

        for(int i=0;i<arrlst.size();i++){
            System.out.println(arrlst.get(i));
        }

        for(int i:arrlst){     // for-each loop
            System.out.println(i);
        }

        System.out.println(arrlst.contains(50));  // It will return boolean value
        System.out.println(arrlst.contains(100));

        arrlst.remove(4);
        arrlst.add(2,80);   // it will insert a new element in between and shift all elements ahead by one place

        arrlst.set(2,34);  // set will replace the old value with new one

        System.out.println(arrlst);
        for(int i:arrlst){
            System.out.println(i);
        }


        // Another ways to create ArrayList.

        List<String> list = Arrays.asList("spider man", "hulk", "thor");

        String[] arr={"apple","banana","strawberry"};
        List<String> fruits=Arrays.asList(arr);     // creates a modifiable list


       List<Integer> list1 = List.of(1,2,3,4);  // creates a non - modifiable list means size can not be changed
        List<String> fruits2= new ArrayList<>(fruits);
        fruits2.add("mango");
        System.out.println(fruits2);

        fruits2.remove(Integer.valueOf(1));

    }
}
