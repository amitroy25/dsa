package dsa.hashmap.hashmapoperation;

import java.util.HashMap;
//hashMap is unordered map
public class HashMapOperation {

    public static void  main(String[] args)
    {
             //creating a hashMap
        HashMap<String ,Integer>hm=new HashMap<>();

        //insert O(1)
        hm.put("india",150);
        hm.put("nepal", 50);
        hm.put("china", 130);

            System.out.println(hm);
            //Get O(1)

            System.out.println(hm.get("nepal"));
            //containsKey(key) O(1)
            System.out.println(hm.containsKey("china"));
            System.out.println(hm.containsKey("america"));

          //remove O(1)

          System.out.println(hm.remove("nepal"));//returning the value of removed key

          System.out.println(hm);

          //isEmpty();
          System.out.println(hm.isEmpty());
          //clear();
        hm.clear();
        System.out.println(hm);
    }


    
}
