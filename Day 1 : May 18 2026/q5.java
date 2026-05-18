// Q5. Write a java program to enter marks of five subjects and calculate total marks and percentage.
import java.util.*;
class q5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of first subject");
        int a=sc.nextInt();
        System.out.println("Enter marks of second subject");
        int b=sc.nextInt();
        System.out.println("Enter marks of third subject");
        int c=sc.nextInt();
        System.out.println("Enter marks of fourth subject");
        int d=sc.nextInt();
        System.out.println("Enter marks of fifth subject");
        int e=sc.nextInt();

        int total=a+b+c+d+e;
        double percentage=total/5;

        System.out.println("Total marks: "+total);
        System.out.println("Percentage: "+percentage);
    }
}
