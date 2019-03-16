package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] arrays = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(arrays[2]);
		// 3. set the third element to a different value
		arrays[2] = "f";
		// 4. print the third element again
		System.out.println(arrays[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(arrays[i]);
		}

		// 6. make an array of 50 integers
		int[] array = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++) {
			Random random = new Random();
			array[i] = random.nextInt(Integer.MAX_VALUE);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int lowestNumber = Integer.MAX_VALUE;
		for (int i = 0; i < 50; i++) {
			if (array[i] < lowestNumber) {
				lowestNumber = array[i];
			}
		}
		System.out.println(lowestNumber);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < 50; i++) {
			System.out.println(array[i]);
		}
		// 10. print the largest number in the array.
		int largestNumber = 0;
		for (int i = 0; i < 50; i++) {
			if (array[i] > largestNumber) {
				largestNumber = array[i];
			}
		}
		System.out.println(largestNumber);
	}
}
