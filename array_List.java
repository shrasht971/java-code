
    import java.util.ArrayList; //import the ArrayList create
    public class array_List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Ferrari");
        cars.add("Tata Nexon");
        cars.add("Mazda");
        System.out.println(cars);
        //To access an element in the ArrayList, use the get() method
        System.out.println(cars.get(1));
        //To modify an element, use the set() method
        cars.set(0,"Opel");
        System.err.println(cars);
        //To remove an element, use the remove() method
        cars.remove(0);
        System.out.println(cars);
        //To find out how many elements an ArrayList have, use the size() method
        System.out.println(cars.size());
        //To remove all the elements in the ArrayList, use the clear() method
        cars.clear();
        System.out.println(cars);
    }
    
}

