package asd;

public class SepDigiAlphaSpec {
	
public void sperating() {
	String str = "sdjsdjkk1273@##@%@%$";
	StringBuffer alpha = new StringBuffer(),num = new StringBuffer(),spec = new StringBuffer();
	char[] specl = str.toCharArray();
	for(int i=0;i<=specl.length-1;i++) {
		if(Character.isAlphabetic(str.charAt(i))) {
			alpha.append(str.charAt(i));
			
		}
		else if(Character.isDigit(str.charAt(i))) {
			num.append(str.charAt(i));
			
		}
		else {
		spec.append(str.charAt(i));
		
		}
	}
	System.out.println("Alphabet = "+alpha);
	System.out.println("Digit = "+num);
	System.out.println("Spec = "+spec);
}
public static void main(String args[]) {
	SepDigiAlphaSpec speDigi = new SepDigiAlphaSpec();
	speDigi.sperating();
	
}
}
