package asd;

public class Patterns {
public static void main(String args[]) {
//	Patterns pat = new Patterns();
//	pat.starInMid();
//	 mixPtrn();
//	 spcPtrn();
//	 spcPtrna();
	incOrd();
}
public static void halfPyr() {
	
	int i, j; 
	int n =5;
	  
    // outer loop to handle number of rows 
    //  n in this case 
    for(i=0; i<n; i++) 
    { 

        //  inner loop to handle number of columns 
        //  values changing acc. to outer loop   
        for(j=0; j<=i; j++) 
        { 
            // printing stars 
            System.out.print("* "); 
        } 

        // ending line after each row 
        System.out.println(); 
    } 
}

public void starInMid() {
	int i,j;
	int k=0;
	int n=4;
	for(i=0;i<n;i++) {
		for(j=0;j<n-1;j++) {
			System.out.println(" ");
			while(k!=(2*i-1)) {
				System.out.print("* ");
				k++;
			}
			k=0;
			System.out.println();
		}
	}
}

public static void mixPtrn() {
	/**  1*****
	 *   12****
	 *   123***
	 *   1234**
	 *   12345*
	 *   123456 
	 */
	for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=6;k>i;k--) {
				System.out.print("*");
			}
			System.out.println();
	}
	
}
public static void spcPtrn() {
	/**
	 * 12345&
	 * 1234&&
	 * 123&&&
	 * 12&&&&
	 * 1&&&&&
	 */
	for(int i=6;i>=1;i--) {
		for(int j=1;j<i;j++) {
			System.out.print(j);
		}for(int k=6;k>=i;k--) {
			System.out.print("&");
		}
		System.out.println();
	}
	
}

public static void spcPtrna(){
	/**
	 * @
	 * @ @
	 * @  @
	 * @   @ 
	 * @@@@@@
	 * 
	 */
    System.out.println("@");
	for(int i=5;i>=1;i--) {
		System.out.print("@");
	for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		System.out.println("@");
	}
	
	for(int j=5;j>0;j--) {
		System.out.print("@ ");
	}
}
/**
 * 1  10 11 20 21 30
 * 2  9 
 * 3  8 
 * 4  7
 * 5  6
 * 6  5
 * 7  4
 * 8  3
 * 9  2
 * 10 1
 */
	public static void incOrd(){
		for(int a=1,b=10,c=11,d=20,e=21,f=30;a<=10;a++,b--,c++,d--,e++,f--) {
			System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		}
	}
}

