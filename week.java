import java.util.Scanner;

public class week {
    public static void main(String[] args)
    {
        int num;
        Scanner week=new Scanner(System.in);
        System.out.println("Enter the week number: ");
        num=week.nextInt();
        switch(num)
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            default:
            System.out.println("invalid");

        }
    }
}
