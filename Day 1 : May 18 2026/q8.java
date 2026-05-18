// Q8. Write a java program swap two number without using third variable.
import java.util.*;
class q8{
    public static void main(String args[]){
        
        int a=10;
        int b=20;
        //using addition and subtraction
        
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a is: "+a);
        System.out.println("b is: "+b);

        //using bitwise operators
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a is: "+a);
        System.out.println("b is: "+b);

        //using multiplication and division
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
}
