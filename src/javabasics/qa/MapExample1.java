package javabasics.qa;

import java.util.*;  
public class MapExample1 {  
public static void main(String[] args) {  
    Map map=new HashMap();  
    //Adding elements to map  
    map.put(1,"Amit");  
    map.put(5,"Rahul");  
    map.put(2,"Jai");  
    map.put(6,"Amit");
    
    //Traversing Map  
    
    for(Object o:map.values()) {
    	System.out.println(o);
    	
    }
    
    Set set=map.entrySet();//Converting to Set so that we can traverse  
//    System.out.println(set);
//    System.out.println();
    Iterator itr=set.iterator(); 
//    System.out.println(itr);
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
//        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
}  
}