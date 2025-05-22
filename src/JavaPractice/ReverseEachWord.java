package JavaPractice;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str= "Jungle book";
				String[] words = str.split(" ");
				for(String str1: words)
				{
					System.out.println(str1);
				}
				String newstr ="";
				for(int i=0;i<words.length;i++)
				{
					for(int j=words[i].length()-1;j>=0;j--)
					{
						newstr= newstr+words[i].charAt(j);
					}
					newstr =newstr +" ";
				}
					System.out.println(newstr);
	}

}
