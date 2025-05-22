package javaPractice3;

import java.io.Console;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Duplicate_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
 //String str= "bread butter bread teacher jam";
 String[] words= str.split(" ");
 
 HashMap<String,Integer> hm = new HashMap<String,Integer>();
 int count=0;
 for(int i=0;i<words.length;i++)
 {
	 if(hm.containsKey(words[i]))
	 {
		 count= hm.get(words[i]);
		 count=count+1;
		 hm.put(words[i], count);
	 }
	 else
	 {
		 hm.put(words[i], 1);
	 }
 }
	 
 for(Entry<String,Integer>ent:hm.entrySet())
 {
	 System.out.println(ent.getKey()+ " " +ent.getValue());
 }
 
 
	}

}
