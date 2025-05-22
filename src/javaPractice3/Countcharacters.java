package javaPractice3;

import java.util.HashMap;
import java.util.Map.Entry;

public class Countcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "aaaa bbbb ccccc";
char[] chararr= str.toCharArray();
HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
for(int i=0;i<chararr.length;i++)
{
	int count=0;
	if(hm.containsKey(chararr[i]))
	{
		count= hm.get(chararr[i]);
		count=count+1;
		hm.put(chararr[i], count);
				
	}
	else
	{
		hm.put(chararr[i], 1);
	}
}

for(Entry<Character,Integer> ent:hm.entrySet())
{
	System.out.println(ent.getKey()+ " "+ ent.getValue());
}


	}

}
