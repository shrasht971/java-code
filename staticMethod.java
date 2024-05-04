//Write the program accessing the static methods of the class
class method{
     static String naming ="";
     public static void names(String name){
        naming = name;
     }
}
public class staticMethod {
    public static void main(String[] args) {
        //Accessing the static method names()
        //and field by clss name itself.
        method.names("Shrashti");
        System.out.println(method.naming);
        //Accessing the static method names()
        //by using object reference.
        method obj = new method();
        obj.names("Rashi");
        System.out.println(obj.naming);
    }
}
