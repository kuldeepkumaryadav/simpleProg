package asd;

import java.util.ArrayList;
import java.util.Iterator;

public class InsertingDelList {

	public static void main(String args[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("12 ");
		list.add("0 ");
		list.add("1 ");
		list.add("78 ");
		list.add("12 ");
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.print(itr.next());  
		}  
	}
}


