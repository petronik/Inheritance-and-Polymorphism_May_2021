import java.util.Arrays;

/*
 Given an array/list [] of integers , Find The maximum difference between the successive elements in its sorted form.

Notes
Array/list size is at least 3 .

Array/list's numbers Will be mixture of positives and negatives also zeros_

Repetition of numbers in the array/list could occur.

The Maximum Gap is computed Regardless the sign.

Input >> Output Examples
maxGap ({13,10,5,2,9}) ==> return (4)

Explanation:
The Maximum Gap after sorting the array is 4 , The difference between 9 - 5 = 4 .
maxGap ({-3,-27,-4,-2}) ==> return (23)
Explanation:
The Maximum Gap after sorting the array is 23 , The difference between |-4- (-27) | = 23 .

Note : Regardless the sign of negativity .

maxGap ({-7,-42,-809,-14,-12}) ==> return (767)  

 Explanation:
The Maximum Gap after sorting the array is 767 , The difference between | -809- (-42) | = 767 .

Note : Regardless the sign of negativity .

maxGap ({-54,37,0,64,640,0,-15}) //return (576)

Explanation:
The Maximum Gap after sorting the array is 576 , The difference between | 64 - 640 | = 576 .

Note : Regardless the sign of negativity .
 */

public class _exercise_03 {
	
	public static int maxGap(int[] numbers){
		int [] biggest = new int[numbers.length - 1];
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			biggest[i] =  Math.abs(Math.abs(numbers[i]) - Math.abs(numbers[i + 1]));
		}
		Arrays.sort(biggest);
		return biggest[biggest.length - 1]; 
	}

	public static void main(String[] args) {

		 int[] num1 = {-54,37,0,64,640,0,-15}; //576
		 int[] num2 ={13,10,5,2,9};  //4
		 int[] num3 ={-3,-27,-4,-2};  //23
		 int[] num4 ={-7,-42,-809,-14,-12};  //767

	
		System.out.println(maxGap(num1));
		System.out.println(maxGap(num2));
		System.out.println(maxGap(num3));
		System.out.println(maxGap(num4));

		
	}

}
