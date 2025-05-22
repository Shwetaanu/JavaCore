
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="java testing bread butter";
		char[] test= str.toCharArray();
		String wt ="";
		for(int i=0;i<test.length;i++)
		{
			if(test[i]!=' ')
			{
				wt=wt+test[i];
			}
				
		}
		System.out.println("String is: "+wt);
		
		
		
		
		
		///method 1:
	/*String[] words= str.split(" ");
	String str1 = "";
	
	for(int i=0;i<words.length;i++)
	{
		str1 =str1+words[i];
	}
	
	System.out.println("String is: "+str1);*/
	
		
	}

}
