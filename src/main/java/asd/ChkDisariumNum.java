package asd;

public class ChkDisariumNum {
public static void main(String[] args) {
	int num = 175;
	int rem = 0;
	int len = String.valueOf(num).length();
	System.out.println(len);
	while(num != 0) {
		rem = num%10;
	}
}
}
