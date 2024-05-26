// Create a program to sum all odd numbers from 1 to a specified number N
import java.util.*;
public class SumOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
        if(i%2==0){
            sum += i;
            System.out.println("Total Sum of all Odd number :" +sum); 
            
        }
      
    }
    }
}
