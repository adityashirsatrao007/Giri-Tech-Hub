// Q.11 Print a grade using ternary operators: 90+: A, 80–89: B, 70–79: C, <70: F
class q11{
    public static void main(String args[]){
        int marks=92;
        char grade=(marks>=90)?'A':(marks>=80)?'B':(marks>=70)?'C':'F';
        System.out.println("Grade is: "+grade);
    }
}