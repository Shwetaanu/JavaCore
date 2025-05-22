import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a[]= new int[] {10,20,30};
		Integer a1[] = new Integer[a.length];
		for(int i=0;i<a.length;i++)
		{
			a1[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a1[i]);
		}*/
		
		int a[]= new int[] {10,40,20,30};
		ArrayList<Integer> ar1 = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
		ar1.add(a[i]);
		}
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		Collections.sort(ar1);
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		Collections.sort(ar1,Collections.reverseOrder());
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}

	}

}
