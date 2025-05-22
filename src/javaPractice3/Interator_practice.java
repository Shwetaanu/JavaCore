package javaPractice3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Interator_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		Iterator<Integer> it= arr.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		////Reverse Iterator... use ListIterator
		ListIterator<Integer> it1= arr.listIterator(arr.size());
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
			
		}
		
	}

}
