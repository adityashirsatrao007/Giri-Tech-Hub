// Q14. Write a Java program to check whether a triangle is valid or not.
import java.util.*;
class q14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1");
        double a=sc.nextDouble();
        System.out.println("Enter side 2");
        double b=sc.nextDouble();
        System.out.println("Enter side 3");
        double c=sc.nextDouble();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
