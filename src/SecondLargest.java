import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer ar1[]= new Integer[] {10,20,30};
		int len= ar1.length;
		
		List<Integer> list = Arrays.asList(ar1);
		
		Collections.sort(list);
		
		int second=list.get(len-2);
System.out.println(second);		

		/*int temp=0;
		int max2=0;
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=i+1;j<ar1.length;j++)
			{
				if(ar1[i]>ar1[j])
				{
					temp=ar1[i];
					ar1[i]=ar1[j];
					ar1[j]=temp;
				}
			}
		}
		
		for(int i=0;i<ar1.length;i++)
		{
				System.out.println(ar1[i]);
		}
		System.out.println(ar1[ar1.length-2]);
	}*/

}
}
