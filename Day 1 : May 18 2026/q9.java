// Q9. Write a Java program to print the ASCII value of a given character.
import java.util.*;
class q9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char a=sc.next().charAt(0);
        System.out.println("ASCII value of "+a+" is "+(int)a);
    }
}
