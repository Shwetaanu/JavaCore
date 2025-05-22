package javapractice2;

public class ReverseEachWordPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Test book jungle";
		
		String words[] =str.split(" ");
		String rev=" ";
		for(int i=0;i<words.length;i++)
		{
			for(int j= words[i].length()-1;j>=0;j--)
			{
				rev= rev+words[i].charAt(j);
				
			}
			rev= rev+" ";
		
		}
		System.out.println(rev);
	}

}
