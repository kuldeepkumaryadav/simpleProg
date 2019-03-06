package asd;

public class SumValueOfArr {
public static void main(String args[]) {
	int[] arr = {12,778,35,659,90,54,9,45,90,234};
	int len = arr.length;
	int sum = 0;
	for(int i = 0;i<=len-1;i++) {
		sum +=arr[i];
	}
	System.out.println("sum = " +sum);
	double avg = sum/len;
	System.out.println("Avg = "+avg);
}
}
