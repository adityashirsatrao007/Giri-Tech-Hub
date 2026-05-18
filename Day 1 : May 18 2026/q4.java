// Q4. Write a java program to enter two angles of a triangle and find the third angle.
import java.util.*;

class q4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Angle 1:");
        double angle1 = sc.nextDouble();

        System.out.println("Enter Angle 2:");
        double angle2 = sc.nextDouble();

        double angle3 = 180 - (angle1 + angle2);

        if(angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("Invalid triangle angles");
        }
        else {
            System.out.println("Angle 3 is: " + angle3);
        }
    }
}
