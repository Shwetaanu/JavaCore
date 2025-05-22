import java.util.HashMap;
import java.util.Map.Entry;

public class Duplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "bread butter bread butter butter";
		String words[] = str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			if(hm.get(words[i])==0)
			{
				hm.put(words[i], 1);
			}
			else
			{
				count++;
				hm.put(words[i], count);
				
			}
				
		}
		
		for(Entry<String,Integer> hm1:hm.entrySet())
		{
			
			System.out.println(hm1.getKey()+ " "+hm1.getValue());
			
		}
		
	}

}
