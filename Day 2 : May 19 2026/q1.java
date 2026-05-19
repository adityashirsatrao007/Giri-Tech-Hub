// Q1. Write a Java program to reverse a number without using loop.Input a number: 123 Reverse number: 321
class q1{
    public static void main(String args[]){

        int num=123;int reverse=0;

        reverse=reverse*10+num%10;
        num=num/10;

        reverse=reverse*10+num%10;
        num=num/10;

        reverse=reverse*10+num%10;
        num=num/10;
        
        System.out.println(reverse);
    }
}