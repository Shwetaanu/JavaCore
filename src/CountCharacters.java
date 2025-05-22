import java.util.HashMap;
import java.util.Map.Entry;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Testing Test";
char[] c= s.toCharArray();

HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
int count =0;

for(int j=0;j<c.length;j++)
{
	if(hm.containsKey(c[j]))
	{
		count= hm.get(c[j]);
		count=count+1;
		hm.put(c[j], count);
		
	}
	else
	{
		if(c[j]!=' ')
		{
		hm.put(c[j], 1);
		}
	}
	
}

for(Entry<Character,Integer> ent: hm.entrySet())
{
	System.out.println(ent.getKey() + " " + ent.getValue());
}

		
	}

}
