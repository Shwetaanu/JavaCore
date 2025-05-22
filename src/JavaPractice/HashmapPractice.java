package JavaPractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Shweta");
		hm.put(2,"Anay");
		hm.put(3,"Gitesh");
		hm.put(4, "Madhavi");
		
		System.out.println(hm);
		
		hm.replace(3, "Prasad");
		System.out.println("\n\n"+hm);
		
		hm.replace(1, "Shweta","Sai");
		System.out.println("\n\n"+hm);
		
		
		
		//System.out.println(hm.get(3));
		
		
		/*for(Integer set: hm.keySet())
		{
			System.out.println(set);
		}
		
		for(String st: hm.values())
		{
			System.out.println(st);
		}
*/
		hm.replace(3, "DDDD");
		for(Entry ent: hm.entrySet())
		{
			System.out.println(ent.getKey() +" " + ent.getValue());
			
		}
	}

}
