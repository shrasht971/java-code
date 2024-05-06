import java.util.*;
import java.util.Collections; //Import the collections of class
public class arrayList_sort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(25);
        numbers.add(15);
        numbers.add(5);
        numbers.add(3);
        numbers.add(35);
        numbers.add(20);
        numbers.add(18);
        Collections.sort(numbers); //Sort numbers
        for(Integer i : numbers){
            System.out.println(i);
        }
    }
    
}
