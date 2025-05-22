
public class Reverseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "java Concept";
		String[] words= str.split(" ");
		String str1="";
		
		for(int i=0;i<words.length;i++)
		{
			
			for(int j=words[i].length()-1;j>=0;j--)
			{
				str1=str1+words[i].charAt(j);
			}
			str1=str1+' ';
		}
		System.out.println(str1);
	}

}
