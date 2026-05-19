// Q3. Write a program to calculate sum of first and last digit of a number without using loop.Input : 123 Output : 4
class q3{
    public static void main(String args[]){
        int num=123;
        int last=num%10;
        int first=num/100;
        int sum=first+last;
        System.out.println("last="+last);
        System.out.println("first="+first);
        System.out.println("sum="+(sum));
    }
}