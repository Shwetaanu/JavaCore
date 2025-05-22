package javapractice2;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "bread butter bread toast";
		String words[]= str.split(" ");
		
		/*
		 * for(int i=0;i<words.length;i++) { System.out.println(words[i]); }
		 */
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			if(hm.containsKey(words[i]))
			{
				count=hm.get(words[i]);
				count=count+1;
				hm.put(words[i], count);
			}
			else
			{
				hm.put(words[i], 1);
			}
			
		}
		
		for(Entry<String,Integer> ent: hm.entrySet())
		{
			System.out.println(ent.getKey()+ " "+ ent.getValue());
		}
	}

}
