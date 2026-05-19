import java.util.*;

public class q5_swap_first_last_digits_of_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int original = n;

        int count = 0;

        // count digits
        while (n != 0) {
            count++;
            n /= 10;
        }

        int factor = (int)Math.pow(10, count - 1);

        int first = original / factor;

        int last = original % 10;

        int mid = original % factor;

        mid = mid / 10;

        int swapped =
                (last * factor) +
                (mid * 10) +
                first;

        System.out.println(swapped);
    }
}