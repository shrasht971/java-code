/*Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

Examples:

Input: n = 15
Output: false
Explanation: The number is not divisible by 2
Input: n = 44
Output: true
Explanation: The number is divisible by 2
Constraints:
0 <= n <= 104

*/
package EvenOdd;

// User function Template for Java
import java.util.Scanner; 

class Solution {
    static boolean isEven(int n) {
        return(n%2 == 0);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        
         int number = sc.nextInt();
         System.out.println("Username is: " + number);
         
        if(isEven(number)){
            System.out.println("The number is divisible by 2");
        }
        else
        {
            System.out.println("The number is not divisible by 2");
        }
    }

}