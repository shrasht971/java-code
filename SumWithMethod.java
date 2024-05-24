import java.util.*;
public class SumWithMethod {
    public static void main(String[] args){
      int first = readNumber();
      int second = readNumber();
      int sum = first + second;
      System.out.println("Sum of the numbers is: " +sum);
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        return number;
    }
}
