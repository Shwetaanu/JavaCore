package javaPractice3;

public class Remove_Whitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "bread butter bread";
		String words[]= str.split(" ");
		String buff="";
		for(int i=0;i<words.length;i++)
		{
			buff=buff+words[i];
		}
		System.out.println("New String: "+buff);
	}

}
