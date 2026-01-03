package controlflow;
// This code showcases controlflow statements in java (if-else, switch, Loops, break and continue statements)

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        // If-Else
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks >= 90) {
            System.out.println("Grade A");
        } else if(marks >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // Switch
        int day = sc.nextInt();
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other Day");
        }

        // For Loop
        for(int i=1; i<=5; i++){
            System.out.println("For Loop: " + i);
        }

        // While Loop
        int i = 1;
        while(i <= 5){
            System.out.println("While Loop: " + i);
            i++;
        }

        // Do-While
        int j = 1;
        do {
            System.out.println("Do-While Loop: " + j);
            j++;
        } while(j <= 5);

        // For-each
        int[] arr = {1, 2, 3};
        for(int num : arr){
            System.out.println("For-each: " + num);
        }

        // Break
        for(int k = 1; k <= 5; k++){
            if(k == 3) break;
            System.out.println("Break at: " + k);
        }

        // Continue
        for(int k = 1; k <= 5; k++){
            if(k == 3) continue;
            System.out.println("Continue skipping: " + k);
        }
    }
}
