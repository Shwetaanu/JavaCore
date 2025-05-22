import java.util.HashMap;
import java.util.Map.Entry;

public class StringPractice {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		String s = "Bread butter Bread butter bread Butter";
		String[] st = s.split(" ");
		
		/*for(int i=0;i<st.length;i++)
		{
				System.out.println(st[i]);
		}*/
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		int count=0;
		for(int i=0;i<st.length;i++)
		{
			if(hm.containsKey(st[i]))
			{
				count = hm.get(st[i]);
				count= count+1;
				hm.put(st[i], count);
			}
			else
			{
				hm.put(st[i], 1);
			}
		}
		
		for(Entry<String,Integer>ent:hm.entrySet())
		{
			System.out.println(ent.getKey()+ " "+ ent.getValue());
		}
			
		
		for(String str: hm.keySet())
		{
			System.out.println(str);
		}
		
		for(int i: hm.values())
		{
			System.out.println(i);
		}
		
		
	}
		
}
