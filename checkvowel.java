// Write a program to Check whether a character is a vowel or consonant using switch statement
import java.util.*;
public class checkvowel {
    public static void main(String[] args)
    {
        char vowel;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your character: ");
        vowel =sc.next().charAt(0);
        switch(vowel)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            System.out.println("These Alphabet is vowel");
            break;
            default:
            System.out.println("These Alphabet is consonant");
        }
    } 
}
