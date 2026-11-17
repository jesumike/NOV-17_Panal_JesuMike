/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_methodsrecursion;

import java.util.Scanner;

/**
 *
 * @author jesumike
 */
public class LoopToRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How Many Grades? ");
        int size = input.nextInt();
        int[] grades = new int[size];
        
        for (int i = 0; i < grades.length; i++){
            System.out.print("Enter Grade " + (i+1) + ": ");
            grades[i] = input.nextInt();
        }
        System.out.print("Enter Passing Mark: ");
        int passingMark = input.nextInt();
        System.out.println("Loop: " + countPassing(grades, passingMark));
        System.out.println("Recursive: " + countPassingRecursive(grades, passingMark, 0));
    }

    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;
        for (int g : grades) {
            if (g >= passingMark) {
                count++;
            }
        }
        return count;
    }

    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index == grades.length) {
            return 0;
        }
        if (grades[index] >= passingMark){
            return 1 + countPassingRecursive(grades,passingMark, index + 1);
        }
       return countPassingRecursive(grades,passingMark, index + 1);
    }
}
     /* 1. What does each recursive call do to index, and why must it change?
      * Answer: Each call of index increases by 1 moving on to the next slot in the 
      * array so that it reaches the base case and stops it to prevent infinite recursion.
      * 2. What happens if you delete the base case entirely?
      * Answer: Without the base case, nothing stops the method from trying to read 
      * the next slot even if it does not exist which causes the program to crash.
     */