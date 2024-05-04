//Write the program implementation of accessing the instance method.
class Foo{
    String name = "";

    //instance method to be called within the
    //same class or from a another class defined
    //in the same package or in different package.
    public void inst_method(String name){
        this.name = name;
    }
}
class instanceMethod{
    public static void main(String[] args){
        //create an instance of the class.
        Foo ob = new Foo();

        //calling an instance metho in the class 'Foo'
        ob.inst_method("Method Calling");
        System.out.println(ob.name);
    }
}