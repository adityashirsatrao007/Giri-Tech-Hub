import java.util.*;
class q1_perfect_number{
    public static void main(String args[]){
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }
}