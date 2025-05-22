package JavaPractice;

public class RevereseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Test book jungle";
		String Newstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			Newstr= Newstr+str.charAt(i);
		}
			
		System.out.println("newstring:"+Newstr);
	}

}
