package dsa.hashmap.iterationonmap;

import java.util.HashMap;
import java.util.Set;
public class IterationOnMap {

    public static void main(String[] args){

    HashMap<String,Integer>hm=new HashMap<>();
   
    hm.put("china", 150);
    hm.put("india",160);
    hm.put("nepal",50);
    hm.put("indonesia",90);

    Set<String>s=hm.keySet();
    System.out.println(s);
    for(String key:s){
        System.out.println(hm.get(key));

    }
    }
    
}
