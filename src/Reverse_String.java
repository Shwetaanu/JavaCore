import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String: ");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String newstring="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newstring= newstring+str.charAt(i);
		}
		
		System.out.println("NewString is:"+newstring);
	}

}
