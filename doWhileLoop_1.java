//  Write a program that reads an integer between 1 and 10 from the user
import java.util.Scanner;

public class doWhileLoop_1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
          System.out.println("Enter a number between 1 and 10:");
          n= sc.nextInt();
        }while(n<1||n>10);
        System.out.println(n +" is between 1 and 10.");
     }
}
