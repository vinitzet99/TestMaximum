/**
 * @Author: Vinit Kumar
 * @created on :05-01-2022
 * Check maximum among 3 values using Generics
 */
package testMaximum;

import java.util.ArrayList;

public class TestMaximum<T extends Comparable> {
    //generic instance variable
    private ArrayList<T> params=new ArrayList<T>();

    //generic constructor
    public TestMaximum(T... params) {
        for(int i=0;i< params.length;i++){
            this.params.add(params[i]);
        }
    }

    /**
     * method to print maximum values
     * take input from testMaximum method
     */
    public static <T> void printMax(T max){
        System.out.printf("The maximum value is: %s\n",max);
    }
    /**
     * method to compute maximum
     * internally calls generic method testMaximum
     */
    public void maximum() {
        TestMaximum.testMaximum(params);
    }

    /**
     * Generic method to compare 3 Strings/Integer/Float
     * Extends Comparable to compare values using CompareTo method
     */
    public static <T extends Comparable> void testMaximum(ArrayList<T> params) {
        int n = params.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (params.get(j).compareTo(params.get(j + 1))>0)
                {
                    // swap arr[j+1] and arr[j]
                    T temp = params.get(j);
                    params.set(j, params.get(j + 1));
                    params.set(j + 1, temp);
                }
        printMax(params.get(n - 1)); // calling print function
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
