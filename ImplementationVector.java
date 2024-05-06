import java.util.Iterator;
import java.util.Vector;

public class  ImplementationVector {
    public static void main(String[]args)
    {
        Vector <Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
       
        v.add(4);
        v.add(8);
        v.add(9);
        v.addElement(5);//legacy method
        v.add(6);
        v.addElement(10);
        System.out.println(v);
        v.remove(8);
        v.removeElement(4);
        System.out.println(v.capacity());
        v.trimToSize();
        System.out.println(v.capacity());
        
        
        Iterator it=v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
      
        
    }
    
}

