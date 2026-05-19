// Q12.Write a java program to find the total number of notes in a given amount.Enter the amount: 2528 Expected output : 500=5 ,100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1

import java.util.*;
class q12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        int originalAmount = amount;

        int[] notes = {500, 200, 100, 50, 20, 10, 5};

        int totalNotes = 0;

        for (int i = 0; i < notes.length; i++) {

            int count = amount / notes[i];

            if (count != 0) {
                System.out.println(notes[i] + " x " + count);

                totalNotes += count;

                amount = amount % notes[i];
            }
        }

        System.out.println("Minimum notes needed: " + totalNotes);
        System.out.println("Remaining amount: " + amount);
    }
}