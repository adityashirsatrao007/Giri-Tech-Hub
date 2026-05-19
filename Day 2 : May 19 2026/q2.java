// Q2. Write a program to find first and last digit of a number without using loop in three digit.
class q2{
    public static void main(String args[]){
        int num=123;
        int last=num%10;
        int first=num/100;
        System.out.println("last="+last);
        System.out.println("first="+first);

        
    }
}