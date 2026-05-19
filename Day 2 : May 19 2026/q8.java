// Q.8 Write a java program to input any alphabet and check whether it is vowel or consonant.
class q8{
    public static void main(String args[]){
        char c='a';
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}