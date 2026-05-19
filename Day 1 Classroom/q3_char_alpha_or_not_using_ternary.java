import java.util.*;

class q3_char_alpha_or_not_using_ternary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        
        String result=((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))?"Alphabet":((ch>='0'&&ch<='9')?"Number":"Special Character");
        System.out.println(result);
    }
}