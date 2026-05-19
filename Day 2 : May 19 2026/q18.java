// Q18. Write a program to input a character and check whether it is a vowel or consonant using a switch case.
// Explanation:
//  Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.
import java.util.*;
class q18{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character");
    char c=sc.next().charAt(0);
    switch(c){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consonant");
    }
}
}