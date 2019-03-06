package asd;

public class RevereString {
	public void reverseSingleString() {
		String str = "SomeOne";
		char[] chng = str.toCharArray();
		for(int i=chng.length-1;i>=0;i--) {
			System.out.print(chng[i]);
		}
		
	}
	public void reverseSentence() {
		String sen = "My Name is yuvraj";
		String sent[] = sen.split(" ");
		for(int i=sent.length-1;i>=0;i--) {
			System.out.print(sent[i]);
		}
	}

	public static void main(String args[]) {
		RevereString reverseString = new RevereString();
		reverseString.reverseSingleString();
		System.out.println("   ");
		reverseString.reverseSentence();
	}
}
