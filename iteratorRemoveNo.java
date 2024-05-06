import java.util.*;
public class iteratorRemoveNo {
   public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(34);
    numbers.add(4);
    numbers.add(3);
    numbers.add(56);
    numbers.add(44);
    numbers.add(8);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()){
        Integer i = it.next();
        if(i<8){
            it.remove();
        }
    }
      System.out.println(numbers);

   } 
}
