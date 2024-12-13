package Collection_Framework;
import java.util.*;
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s2.length()-s1.length();
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}


public class comparator_Learning {
    public static void main(String[] args) {
        ArrayList <Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(1);
        lst.add(3);
        lst.sort(new MyComparator());
        System.out.println(lst);


        List <String> fruits = Arrays.asList("kiwi","pineapple","grapes","apple");
        fruits.sort(new StringLengthComparator());
        System.out.println(fruits);
    }
}
