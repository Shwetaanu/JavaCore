import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= new int[] {10,20,30,40,10,20,30};
		display(array);

	}
	
	public static void display(int[] array)
	{
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			if(hm.containsKey(array[i]))
			{
				int count= hm.get(array[i]);
				count++;
				hm.put(array[i],count);
			}
			else
			{
				hm.put(array[i],1);
			}
		}
		
		System.out.println(hm);
		
		for(Entry<Integer,Integer> ent:hm.entrySet())
		{
			if(ent.getValue()>1)
			{
				System.out.println(ent.getKey());
			}
		}
	}
}
