import java.util.ArrayList;
public class arrayList_loop {
    public static void main(String[] args) {
  ArrayList<String> fruits = new ArrayList<String>();
  fruits.add("Banana");
  fruits.add("Mango");
  fruits.add("Apple");
  fruits.add("Pineapple");
  fruits.add("Grapes");
  fruits.add("Apricot");
  for(int i=0;i < fruits.size();i++){
    System.out.println(fruits.get(i));
  }

}
}