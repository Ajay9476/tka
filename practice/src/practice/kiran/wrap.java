package practice.kiran;

import java.util.Scanner;

public class wrap {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];
        
        // Prompt user to enter five numbers
        System.out.println("Enter any five numbers:");
        
        // Read 5 numbers into the array (note the loop starts from 0)
        for (int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }
        
        // Swapping logic (for example, swap adjacent elements)
        try {
            int temp = number[0];
            number[0] = number[1];
            number[1] = temp;

            temp = number[2];
            number[2] = number[3];
            number[3] = temp;

            temp = number[4];
            number[4] = number[0];
            number[0] = temp;

        } catch (Exception e) {
            System.out.println("An error occurred during swapping.");
        }

        // Print the numbers after swapping
        System.out.println("Numbers after swapping:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Number " + (i + 1) + ": " + number[i]);
        }
        
        sc.close();
    }
}
