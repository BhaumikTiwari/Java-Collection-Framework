package Collection_Framework;

import java.util.*;
public class Linked_HashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f,true);  //double linked list
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Grapes", 120);
        linkedHashMap.put("Mango",12);
        linkedHashMap.get("Orange");
        linkedHashMap.get("Mango");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Grapes");
        linkedHashMap.get("Grapes");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Mango");
        // least used will be placed above, here grapes is used least

        for (Map.Entry<String, Integer> i : linkedHashMap.entrySet()) {
            System.out.println(i.getKey()+" : "+i.getValue());
        }

        //another way to create Linked HashMap
        HashMap<String,Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Saurabh",88);
        hashMap.put("Shubhi",82);
        hashMap.put("Rohit",78);
        hashMap.put("Daniel",68);
        hashMap.put("Atul",89);

        Integer res=hashMap.getOrDefault("Rohit",0);
        System.out.println(res);

        int res2=hashMap.getOrDefault("bob",0);
        System.out.println(res2);

        hashMap.putIfAbsent("Shubham",67);  // will only insert in map if the value is not present in map.
        System.out.println(hashMap);

        for (Map.Entry<String, Integer> i : hashMap.entrySet()) {
            System.out.println(i.getKey()+" : "+i.getValue());
        }


    }



}
