package asd;

import java.util.Arrays;

public class ArraySort {

	public static void main(String args[]) {
		int[] arr1 = { 123, 678, 267, 908, 78674, 76, 6734, 98, 2, 9 };
		String[] arr2 = { "java", "C", "C++", "C#", "linux", "selenium", "jdbc" };
		System.out.println("original integer are" + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Sorted integers" + Arrays.toString(arr1));
		System.out.println("original string are" + Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Sorted string" + Arrays.toString(arr2));
	}
}