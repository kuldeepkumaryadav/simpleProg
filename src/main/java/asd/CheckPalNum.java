package asd;

public class CheckPalNum {
public static void main(String[] args) {
	int num = 371;
	int rem;
	int fin = 0;
while(num != 0) {
	rem = num%10;
	fin +=(rem*rem*rem);
	num = num/10;
	
}
System.out.println(fin);
}
}
