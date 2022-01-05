/**
 * @Author: Vinit Kumar
 * @created on :05-01-2022
 * Check maximum among 3 values using Generics
 */
package testMaximum;

public class TestMaximum {
    //Find maximum value between 3 Integer using CompareTo
    public static void testMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (max.compareTo(y) < 0) {
            max = y;
        }
        if (max.compareTo(z) < 0) {
            max = z;
        }
        System.out.printf("The maximum value among %s, %s, %s is %s.\n", x, y, z, max);
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Compute maximum using Generics !!!");
        //variable initialize
        Integer intX = 1, intY = 2, intZ = 3;
        //find maximum value
        testMaximum(intX, intY, intZ);
    }
}
