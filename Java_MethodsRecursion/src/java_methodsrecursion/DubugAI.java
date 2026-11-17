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
public class DubugAI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Result: " + factorial(number));

        input.close();
    }

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
    /* 1.Why did one wrong return make every result wrong?
     * Answer: The base case acts as the anchor of the method because every call in recursion
     * eventually counts down into it. Since the base case returned 0, that 0 got multiplied into all
     * the empty slots and since any number multiplied by 0 is 0, it results in 0. 
     * 2. Stretch: what happens for factorial(-2) with your corrected code, and why?
     * Answer: The program returns 1, because we have set a specific condition where n <= 0 instead of n == 0.
     * Without it, subtracting 1 from -2 would go on forever since it will never reach 0.
    */