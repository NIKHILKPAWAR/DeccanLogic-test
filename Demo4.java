package Deccan;
import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
	
	    public static void main(String args[]) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the required size of the array ::");
	        int size = s.nextInt();
	        int[] myArray = new int[size];
	        System.out.println("Enter elements of the array");
	        for (int i = 0; i < size; i++) {
	            myArray[i] = s.nextInt();
	        }
	        System.out.println(Arrays.toString(myArray));
	        int[] myArray1 = Arrays.copyOfRange(myArray, 0, myArray.length / 2);
	        int[] myArray2 = Arrays.copyOfRange(myArray, myArray.length / 2, myArray.length);

	        int sum1=0;
	            for (int i = 0; i <myArray1.length; i++)
	                sum1 =sum1 + myArray1[i];
	            
	        int sum2=0;
	        for (int i = 0; i <myArray2.length; i++)
	            sum1 =sum1 + myArray2[i];
	        System.out.println("First half of the array:: " + Arrays.toString(myArray1));
	        System.out.println("First second of the array:: " + Arrays.toString(myArray2));
	        System.out.println("First second of the array:: " + Arrays.toString(myArray2));
	        System.out.println("sum of the array1:: " + sum1);
	        System.out.println("sum of the array1:: " + sum2);
	    }
	
}
