// Write the program use the TreeMap Class 
  
// Importing required classes 
import java.util.*; 
  
// Main class 
public class ImplementTreeMap { 
  
    // Main driver method 
    public static void main(String[] args) 
    { 
  
        // Creating an empty TreeMap 
        Map<String, Integer> map = new TreeMap<>(); 
  
        // Inserting custom elements in the Map 
        // using put() method 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
  
        // Iterating over Map using for each loop 
        for (Map.Entry<String, Integer> e : map.entrySet()) 
  
            // Printing key-value pairs 
            System.out.println(e.getKey() + " "
                               + e.getValue()); 
    } 
}
