package javaPractice3;

import java.util.Scanner;

public class String_upper_lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter String \n");
Scanner sc = new Scanner(System.in);
String str= sc.nextLine();
String str1= "";
char[] letters= str.toCharArray();

for(int i=0;i<letters.length;i++)
{
	if(Character.isLowerCase(letters[i]))
	{
		char j= Character.toUpperCase(letters[i]);
		str1=str1+j;
	}
	else
		if(Character.isUpperCase(letters[i]))
		{
			char k= Character.toLowerCase(letters[i]);
			str1=str1+k;
		}
	
}
System.out.println(str1);


	}

}
