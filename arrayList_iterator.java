//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
//To use an Iterator, you must import it from the java.util package.
import java.util.ArrayList;
import java.util.Iterator;
public class arrayList_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        //The iterator() method can be used to get an Iterator for any collection
        Iterator<Integer> it = numbers.iterator();
        //To loop through a collection, use the hasNext() and next methods of the Iterator
        while(it.hasNext()){
            System.out.println("iterator " + it.next());
        }
    }
}
