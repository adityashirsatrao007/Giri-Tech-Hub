// Q15. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
import java.util.*;
class q15{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1");
        double a=sc.nextDouble();
        System.out.println("Enter side 2");
        double b=sc.nextDouble();
        System.out.println("Enter side 3");
        double c=sc.nextDouble();

        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                System.out.println("Equilateral Triangle");
            }else if(a==b || b==c || a==c){
                System.out.println("Isosceles Triangle");
            }else{
                System.out.println("Scalene Triangle");
            }
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
