//Q.15 Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
//Explanation: Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.
import java.util.*;
class q15{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
    System.out.println("Enter second number");
    int b=sc.nextInt();
    System.out.println("Enter operator");
    char op=sc.next().charAt(0);
    switch(op){
        case '+':
            System.out.println("Sum: "+(a+b));
            break;
        case '-':
            System.out.println("Difference: "+(a-b));
            break;
        case '*':
            System.out.println("Product: "+(a*b));
            break;
        case '/':
            System.out.println("Division: "+(a/b));
            break;
        case '%':
            System.out.println("Modulo: "+(a%b));
            break;
        default:
            System.out.println("Invalid operator");
    }
}
}