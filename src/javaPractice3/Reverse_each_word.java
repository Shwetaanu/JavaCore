package javaPractice3;

import java.util.Scanner;

public class Reverse_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter STring: ");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String str1= "";
			
			for(int j=words[i].length()-1;j>=0;j--)
			{
				str1= str1+words[i].charAt(j);
			}
			System.out.print(str1+ " ");
		}
		

	}

}
