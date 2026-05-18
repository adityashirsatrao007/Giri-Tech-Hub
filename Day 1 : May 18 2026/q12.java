// Q12. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators. Example: a → A, Z → z.
import java.util.*;
class q12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char a=sc.next().charAt(0);

        if(a>='a' && a<='z'){
            a=(char)(a-32);
        }else if(a>='A' && a<='Z'){
            a=(char)(a+32);
        }
        System.out.println("Toggled case: "+a);
    }
}
