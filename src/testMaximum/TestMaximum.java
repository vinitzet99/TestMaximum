/**
 * @Author: Vinit Kumar
 * @created on :05-01-2022
 * Check maximum among 3 values using Generics
 */
package testMaximum;

public class TestMaximum<T extends Comparable> {
    //generic instance variable
    private T x, y, z;

    //generic constructor
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * method to print maximum values
     * take input from testMaximum method
     */
    public static <T> void printMax(T x,T y,T z,T max){
        System.out.printf("The maximum value among %s, %s, %s is %s.\n",x,y,z,max);
    }
    /**
     * method to compute maximum
     * internally calls generic method testMaximum
     */
    public void maximum() {
        TestMaximum.testMaximum(x, y, z);
    }

    /**
     * Generic method to compare 3 Strings/Integer/Float
     * Extends Comparable to compare values using CompareTo method
     */
    public static <T extends Comparable> void testMaximum(T x, T y, T z) {
        T max = x;
        if (max.compareTo(y) < 0) {
            max = y;
        }
        if (max.compareTo(z) < 0) {
            max = z;
        }
        printMax(x,y,z,max); // calling print function
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Compute maximum using Generics !!!");
        //variable initialize
        Integer intX = 1, intY = 2, intZ = 3;
        Float floatX = 1.1f, floatY = 4.1f, floatZ = 3.1f;
        String stringX = "Test3", stringY = "Test2", stringZ = "Test1";
        //find maximum value by creating object
        new TestMaximum(intX, intY, intZ).maximum();
        new TestMaximum(floatX, floatY, floatZ).maximum();
        new TestMaximum(stringX, stringY, stringZ).maximum();
    }
}
