package Collection_Framework;
import java.util.*;
public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer,String> mpp = new HashMap<>();
        mpp.put(1,"Amit");
        mpp.put(2,"bhaskar");
        mpp.put(3,"Shreya");
        System.out.println(mpp);

        String student=mpp.get(3);
        System.out.println(student);

        System.out.println(mpp.get(20));  // will give null

        System.out.println(mpp.containsKey(4));
        System.out.println(mpp.containsValue("Amit"));

        for(int i:mpp.keySet()){
            System.out.println(mpp.get(i));
        }

        for (Map.Entry<Integer, String> i : mpp.entrySet()) {
            System.out.println(i.getKey()+" : "+i.getValue());
        }

        mpp.remove(3);


    }
}
