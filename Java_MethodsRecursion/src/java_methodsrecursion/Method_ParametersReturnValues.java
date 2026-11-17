/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_methodsrecursion;

/**
 *
 * @author jesumike
 */
public class Method_ParametersReturnValues {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        System.out.println(computeAverage(10, 4));
        System.out.println(computeAverage(10, 0));
    }

    public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0;
        }
        double average = (double) total / count;
        return average;
    }
}
    /* 1. Why does the method need the word double(or a cast) in return?
     * Answer: The word double(or a cast) is needed so that the decimal point isn't removed
     * and the double return type allows it to get sent back.
     * 2. What would go wrong without the count <= 0 guard?
     * Answer: Calculations would return with infinity and would also give error calculations since
     * divided by 0 is not possible and negative counts would give invalid results.
    */
