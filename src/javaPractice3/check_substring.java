package javaPractice3;

import java.util.Scanner;

public class check_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter String: \n");
Scanner sc= new Scanner(System.in);
String str = sc.nextLine();

if(str.contains("test"))
{
	System.out.println("substring present");
}
else
{
	System.out.println("substring not present");
}

System.out.println(str.substring(0, 3));
	}
	
	

}
