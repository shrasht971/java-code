//Write a program to read gender(M/F) and print the corresponding gender using a switch statement
import java.util.*;
public class Gender {
    public static void main(String[] args)
    {
        char gender;
        Scanner sc=new Scanner(System.in);
        System.out.println("Your Gender");
        gender=sc.next().charAt(0);
        switch(gender)
        {
            case 'm':
            case 'M':
            System.out.println("Male");
            break;
            case 'f':
            case 'F':
            System.out.println("Female");
            break;
            default:
            System.out.println("Invalid Gender");
        }

    }
    
}
