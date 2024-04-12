//Write a program to Find the number of days in a month using a switch statement
import java.util.*;
public class monthinday {
    public static void main(String[] args){
        String month;
        Scanner sc=new Scanner(System.in);
        System .out.println("Enter the month");
        month=sc.nextLine();
        switch(month)
        {
            case "January":
            case "january":
            System.out.println("January: 31 days");
            break;
            case "February":
            case "february":
            System.out.println("February: (28 or 29)days");
            break;
            case "March":
            case "march":
            System.out.println("March: 31 days");
            break;
            case "April":
            case "april":
            System.out.println("April: 30");
            break;
            case "May":
            case "may":
            System.out.println("May: 31");
            break;
            case "june":
            case "June":
            System.out.println("June: 30");
            break;
            case "july":
            case "July":
            System.out.println("July: 31");
            break;
            case "august":
            case "August":
            System.out.println("August: 31");
            break;
            case "september":
            case "September":
            System.out.println("September: 30");
            break;
            case "october":
            case "October":
            System.out.println("october: 31");
            break;
            case "november":
            case "November":
            System.out.println("November: 30");
            break;
            case "december":
            case "December":
            System.out.println("December: 31");
            break;
            default:
            System.out.println("Invalid month");
        }
    }
}
