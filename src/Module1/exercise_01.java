
/*
Challenge:

Given a two-dimensional array of integers, return the flattened version of the array 
with all the integers in the sorted (ascending) order.

Example:

Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
*/


import java.util.Arrays;

public class exercise_01 {
	
	public static int[] flattenAndSort(int[][] array) {
		int len = 0;

		for (int i = 0; i < array.length; i++) {
			len += array[i].length;
		}
		int[] res = new int[len];
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				res[k++] = array[i][j];
			}
		}
		Arrays.sort(res);
		return res;
	}

	public static void main(String[] args) {
		System.out.println(
			Arrays.toString(flattenAndSort(new int[][] {{3, 2, 1}, {4, 6, 5}, {555, 465}, {9, 8, 7}}))
			);
	}

}
