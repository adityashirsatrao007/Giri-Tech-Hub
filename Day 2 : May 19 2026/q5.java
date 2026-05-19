// Q5. Write a java program to check whether number is palindrome or not. 
class q5{
    public static void main(String args[]){
        int n=121;
        int reverse=0;
        int temp=n;
        while(temp>0){
            reverse=reverse*10+temp%10;
            temp/=10;
        }
        if(n==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}