// Q.10 Write a java program to find a minimum between three numbers. 
class q10{
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c=30;
        if(a<b && a<c){
            System.out.println("a is minimum");
        }
        else if(b<a && b<c){
            System.out.println("b is minimum");
        }
        else{
            System.out.println("c is minimum");
        }
    }
}