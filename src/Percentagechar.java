
public class Percentagechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Java Concept of the day1";
		
		char[] letters=str.toCharArray();
		int lowercase =0;
		int uppercase=0;
		int digit=0;
		int specialchar =0;
		
		for(int i=0;i<letters.length;i++)
		{
			if(Character.isLowerCase(letters[i]))
			{
				lowercase++;
			}
			else
			if (Character.isDigit(letters[i]))
			{
				digit++;
			}
			else
			if(Character.isUpperCase(letters[i]))
			{
				uppercase++;
			}
			else
				if(Character.isSpaceChar(letters[i]))
				{
					
					specialchar++;
				}
			
			
		}
		
		System.out.println("Lowercase:"+lowercase);
		System.out.println("uppercase:"+uppercase);
		System.out.println("specialchar:"+specialchar);
		System.out.println("digit:"+digit);
		

	}

}
