
public class RotationsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="javatesttest1";
		String str2 ="test1javatest";
		String test="testtest1test1";
		str1 =str1+str2;
		System.out.println(str1);
		
		if(str1.contains(test))
		{
			System.out.println("String is rotation.");
			
			
		}
		else
			
		{
			System.out.println("String is not rotation.");
			
		}

	}

}
