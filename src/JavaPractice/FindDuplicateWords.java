package JavaPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="butter bread butter bread butter bread bread bread bread Toast";
		String[] words= str.split(" ");
		for(String st:words)
		{
			System.out.println(st+"\n");
		}
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		int count=0;
		
		for(int i=0;i<words.length;i++)
		{
			if(hm.containsKey(words[i]))
			{
				count= hm.get(words[i]);
				count=count+1;
				hm.put(words[i], count);
			}
			else
			{
				count=1;
				hm.put(words[i], count);
			}
		}
		
		for(Entry<String,Integer> ent: hm.entrySet())
		{
			System.out.println(ent.getKey() + " "+ ent.getValue()+"\n");
		}
		
		
	}

}
