import java.util.ArrayList;
import java.util.Arrays;

/*
 Given an array of integers , 
 Find the maximum product obtained from multiplying 2 adjacent numbers in the array.

Notes
Array/list size is at least 2.

Array/list numbers could be a mixture of positives, negatives also zeroes .

Input >> Output Examples
adjacentElementsProduct([1, 2, 3]); ==> return 6

Explanation:
The maximum product obtained from multiplying 2 * 3 = 6, and they're adjacent numbers in the array.
adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50

Explanation:
Max product obtained from multiplying 5 * 10 = 50 .
adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921])  ==>  return -14

Explanation:
The maximum product obtained from multiplying -2 * 7 = -14, and they're adjacent numbers in the array.
 
 */
public class _exercise_04 {

	public static int adjacentElementsProduct(int[] array) {
 		
		int [] value = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			value[i] = array[i] * array[i + 1];
		}
		Arrays.sort(value);
		return  value[value.length - 1];
	}

	public static void main(String[] args) {
		
		int[] num1 = {1, 2, 3}; //==> return 6
		int[] num2 = {9, 5, 10, 2, 24, -1, -48}; // ==> return 50
		int[] num3 = {-23, 4, -5, 99, -27, 329, -2, 7, -921};  //==>  return -14

		System.out.println(adjacentElementsProduct(num1));
		System.out.println(adjacentElementsProduct(num2));
		System.out.println(adjacentElementsProduct(num3));
	}
}
