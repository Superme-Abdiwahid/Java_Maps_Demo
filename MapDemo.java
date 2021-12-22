/* Author @Abdiwahid Bishar Hajir
In this demo we cover maps a data structure
in java. We would be clinets of this class */
import java.util.*;
public class MapDemo{
   public static void main(String[] args){
   Map<Integer, String> map = new TreeMap<>();
   map.put(2020, "Jacob");
   map.put(2021, "Yusuf");
   map.put(1990, "Poun");
   System.out.print("Before calling reverse old Map = " + map + "\n");
    Map<String, Integer> update = reverse(map);
    System.out.print("After calling reverse new Map now = " + update + "\n");
   
   }
   
   /* Write a method reverse that takes a Map of 
   Integers representing students birthdays to 
   Strings representing students. Which switches
   and returns a new map which maps a student to
   therir birthday. for example 2002 => Abdiwahid
   maps to a new map with a new association Abdiwahid => 2002
   After calling this method*/
   
   public static Map<String, Integer> reverse(Map<Integer, String> oldMap){
      Map<String, Integer> map = new LinkedHashMap<>();
      for(Integer numbers: oldMap.keySet()){
         String students = oldMap.get(numbers);
         map.put(students, numbers);
      }
      return map;
   
   }




}
