// Q16. Write a Java program to check whether a number is positive , negative or zero.
import java.util.*;
class q16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        }else if(n<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }
    }
}
