import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> hm = new HashMap<String,Integer>();
hm.put("Shweta", 10);
hm.put("Gitesh", 20);
hm.put("Madhavi",30);


	System.out.println(hm.get("Gitesh"));
	
	for(String str:hm.keySet())
	{
		System.out.println(str);
	}
	
	for(int i:hm.values())
	{
		System.out.println(i);
	}
	
	for(Entry<String,Integer> ent:hm.entrySet())
	{
		System.out.println(ent.getKey()+" "+ ent.getValue());
		
	}
	
	hm.put("Gitesh1", 40);

	for(Entry<String,Integer> ent:hm.entrySet())
	{
		System.out.println(ent.getKey()+" "+ ent.getValue());
		
	}
	
	hm.remove("Gitesh");
	for(Entry<String,Integer> ent:hm.entrySet())
	{
		System.out.println(ent.getKey()+" "+ ent.getValue());
		
	}
	hm.replace("Madhavi", 80);
	for(Entry<String,Integer> ent:hm.entrySet())
	{
		System.out.println(ent.getKey()+" "+ ent.getValue());
		
	}
	HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
	hm.put("aaaa", 10);
	hm.put("bbbb", 20);
	hm.put("cccc",30);

	hm.putAll(hm1);
	
	for(Entry<String,Integer> ent:hm.entrySet())
	{
		System.out.println(ent.getKey()+" "+ ent.getValue());
		
	}



	}

}
