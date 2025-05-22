
public class ReverseString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="i am a boy";
		char[] test= str.toCharArray();
		String str2="";
		char[] test2 = new char[test.length];
		for(int i=0;i<test.length;i++)
		{
			System.out.print(test[i]);
		}
		
		
		for(int i=0;i<test.length;i++)
		{
			if(test[i]==' ')
			{
				test2[i]=' ';
				
			}
		}
		int j=test.length-1;
				
		for(int i=0;i<test.length;i++)
		{
			if(test[i]!=' ')
			{
				//	System.out.print(test2[i]);
				
				if(test2[j]==' ')
				{
					j--;
				}
				test2[i]= test[j];
				j--;
				
			}
		}
		System.out.print("\n");
		
		for(int i=0;i<test2.length;i++)
		{
			
		System.out.print(test2[i]);
		}

	}

}
