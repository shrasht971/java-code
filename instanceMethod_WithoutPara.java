// Write the program to see how can we call an instance method without parameter
//Different class
class sumNumber{
    //Instance method in different class
    void add(){
        int a =2;
        int b = 3;
        System.out.println("The sum of two number is :" + (a+b));
    }
    
}
public class instanceMethod_WithoutPara {
//Static method
    public static void main(String[] args) {
        
    //creating object of the class
 sumNumber obj=new sumNumber();  
 //calling instance method
 obj.add();
}
}
