// Q7. Write a java program swap two number using third variable.
import java.util.*;
class q7{
    public static void main(String args[]){
        int a=10;
        int b=20;
        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
}
