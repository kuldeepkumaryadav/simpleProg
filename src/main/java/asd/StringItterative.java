package asd;

import java.util.Arrays;

public class StringItterative {

	
	public static void main(String args[]) {
		int[] arr1 = {9,78,67,23,-12,-78,-90,-76,23,65,90,12,-23,-34,90,-76};
		int n = arr1.length;
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[n-2]+arr1[0]);
		
	}
}
