package javapractice2;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmappractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(1,"Shweta");
		hm.put(2,"Gitesh");
		hm.put(3,"Anay");
		
	for(int m:hm.keySet())
	{
		System.out.println(m);
	}

	for(String str:hm.values())
	{
		System.out.println(str);
	}
	
	for(Entry<Integer,String> ent:hm.entrySet())
	{
		System.out.println(ent.getKey()+ " "+ ent.getValue());
	}


	}

}
