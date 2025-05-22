import java.util.ArrayList;

public class Duelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]= new int[]{10,20,30,10,20,30,40};
display(array); 

	}
	
	public static void display(int[] array)
	{
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
				
			System.out.println("elements are:" + array[i] );
				}
		}
	}
	
	}
}

