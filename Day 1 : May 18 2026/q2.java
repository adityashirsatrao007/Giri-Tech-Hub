// Q2. Write a java program to input all basic data types and print its output.
import java.util.*;

class q2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        byte a = sc.nextByte();
        short b = sc.nextShort();
        int c = sc.nextInt();
        long d = sc.nextLong();
        float e = sc.nextFloat();
        double f = sc.nextDouble();
        char g = sc.next().charAt(0);
        boolean h = sc.nextBoolean();
        String i=sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }

}
