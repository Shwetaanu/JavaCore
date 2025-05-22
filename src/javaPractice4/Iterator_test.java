package javaPractice4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Iterator_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> st= new HashSet<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		
		for(int i:st)
		{
			System.out.println(i);
		}

		List<Integer> ll = new ArrayList<Integer>(st);
		for(int j:ll )
		{
			System.out.println(j);
		}
		
		
	Iterator itr=	ll.iterator();
	{
		System.out.println(itr.next());
	}
	
	
	ListIterator<Integer> litr = ll.listIterator(ll.size());
	
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
	
			
			
		
	}

}
