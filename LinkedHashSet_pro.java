import java.util.LinkedHashSet;

public class LinkedHashSet_pro {
    public static void main(String[]args){
      LinkedHashSet<String> s= new LinkedHashSet<String>();
      s.add("sneha");
      s.add("pravin");
      s.add("anjali");
      s.add("ram");
      
        System.out.println(s);
        
//        s.removeAll(s);
//        System.out.println(s); 
     System.out.println(s.size());
//     s.clear();
//        System.out.println(s);
     System.out.println(s.contains(4));
    }
    
    
}

