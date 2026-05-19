// Q.6 Write a Java program to check whether character is alphabetic or not.
class q6{
    public static void main(String args[]){
        char c='a';
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println("Alphabetic");
        }
        else if((c>='0' && c<='9')){
            System.out.println("Number");
        }
        else{
            System.out.println("Special Character");
        }   
    }
}